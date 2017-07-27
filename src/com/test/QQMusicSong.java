package com.test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.Base64;
import com.model.Lrc;
import com.model.Music;

public class QQMusicSong {
	private Music searchMusic;
	private Random random = new Random();
	private String fileName;
	private String vkey;
	// guid值
	private long guid;
	// 音乐下载链接
	private String musicUrl;
	// 下载路径
	private File downloadFile;
	private Scanner scanner = new Scanner(System.in);
	// mediaMid的值
	private String mediaMid;
	// 临时存放名称集合
	private List<String> names = new ArrayList<String>();
	// 真实的下载名称
	private String downloadFileName;

	public long getGuid() {
		long guid = (Long.valueOf(random.nextLong() * 2147483647) * (Long.valueOf((System.currentTimeMillis() * 1000)))
				% 10000000000l);
		return guid;
	}

	public QQMusicSong(Music searchMusic) {
		super();
		this.searchMusic = searchMusic;
	}

	/**
	 * 获取vkey值
	 * 
	 * @throws IOException
	 */
	public void getVKey() throws IOException {
		StringBuilder sb = new StringBuilder("https://c.y.qq.com/base/fcgi-bin/fcg_music_express_mobile3.fcg?");
		System.out.println("**********搜索到的音乐*************");

		for (int i = 0; i < searchMusic.getData().getSong().getList().size(); i++) {
			names.add(i + " " + searchMusic.getData().getKeyword() + "_"
					+ searchMusic.getData().getSong().getList().get(i).getAlbum().getTitle());
			System.out.println(names.get(i));
		}
		System.out.println("**********搜索到的音乐*************");
		System.out.println("请输入你要下载歌曲的编号");
		int nextInt = scanner.nextInt();
		downloadFileName = names.get(nextInt);
		mediaMid = searchMusic.getData().getSong().getList().get(nextInt).getFile().getStrmediamid();
		fileName = "C400" + mediaMid + ".m4a";
		guid = getGuid();
		sb.append("format=json&platform=yqq&cid=205361747&songmid=").append(mediaMid).append("&filename=")
				.append(fileName).append("&guid=").append(guid);
		String request = openConnection(sb.toString(), "get", null, null, false);
		JSONObject object = JSON.parseObject(request);
		JSONObject object2 = (JSONObject) object.getJSONObject("data").getJSONArray("items").get(0);
		vkey = (String) object2.get("vkey");
	}

	/**
	 * 获取指定歌曲的播放地址
	 * 
	 * @return
	 */
	public String getMusicUrl() {
		StringBuilder sb = new StringBuilder("http://dl.stream.qqmusic.qq.com/").append(fileName).append("?")
				.append("vkey=").append(vkey).append("&guid=").append(guid);
		return sb.toString();
	}

	/**
	 * 歌曲存储 歌词采用的是base64的加密方式.所以要进行解密才能够使用
	 * 
	 * @param path
	 * @return
	 */
	public String musicSave(String path) {
		musicUrl = getMusicUrl();
		System.out.println("获取到的下载地址:" + musicUrl);
		downloadFile = new File(path, downloadFileName + ".m4a");
		if (downloadFile.exists()) {
			downloadFile.mkdirs();
		}
		String requesst = openConnection(musicUrl, "get",
				"pgv_pvi=6725760000;pgv_si=s4324782080;pgv_pvid=" + guid + ";qqmusic_fromtag=66", null, true);
		return requesst;
	}

	/**
	 * 保存歌词
	 * 
	 * @return
	 * @throws IOException
	 */
	@SuppressWarnings("resource")
	public String saveLrc(String path) throws IOException {
		StringBuilder sb = new StringBuilder(
				"https://c.y.qq.com/lyric/fcgi-bin/fcg_query_lyric_new.fcg?g_tk=753738303&songmid=").append(mediaMid);
		String string = openConnection(sb.toString(), "get", "skey=@LVJPZmJUX;p", "https://y.qq.com/portal/player.html",
				false);
		Lrc lrc = JSON.parseObject(string.substring(18, string.length() - 1), Lrc.class);
		String lyric = lrc.getLyric();
		byte[] bs = Base64.decodeFast(lyric);
		// System.out.println("解密后的歌词:" + new String(bs));
		FileOutputStream stream = new FileOutputStream(new File(path, downloadFileName + ".lrc"));
		stream.write(bs);
		stream.close();
		if (lrc.getTrans() != null) {
			// 说明翻译歌词存在
			String trans = lrc.getTrans();
			byte[] decodeFast = Base64.decodeFast(trans);
			stream = new FileOutputStream(new File(path, downloadFileName + "-trans.lrc"));
			stream.write(decodeFast);
			stream.close();
		}
		return string;
	}

	/**
	 * 网络请求封装
	 * 
	 * @param url
	 *            请求地址
	 * @param method
	 *            请求方式 get post
	 * @return
	 */
	public String openConnection(String url, String method, String cookie, String referer, boolean isFile) {
		URL url2;
		try {
			url2 = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) url2.openConnection();
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setConnectTimeout(5000);
			if (cookie != null) {
				conn.setRequestProperty("Cookie", cookie);
			}
			if (referer != null) {
				conn.setRequestProperty("Referer", referer);
			}
			if ("get".equals(method.toLowerCase())) {
				method = method.toUpperCase();
			} else if ("post".equals(method.toLowerCase())) {
				method = method.toUpperCase();
			} else {
				method = "GET";
			}
			conn.setRequestMethod(method);
			int code = conn.getResponseCode();
			if (code == 200) {
				System.out.println("请求相应成功" + code);
			} else {
				System.out.println("请求相应失败" + code);
				return null;
			}
			BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
			byte[] bytes = new byte[512];
			int len = -1;
			StringBuilder temp = new StringBuilder();
			FileOutputStream stream = null;
			if (isFile) {
				stream = new FileOutputStream(downloadFile);
			}
			while ((len = bis.read(bytes)) != -1) {
				if (isFile) {
					stream.write(bytes, 0, len);
				} else {
					temp.append(new String(bytes, 0, len));
				}
			}
			if (stream != null) {
				stream.close();
			}
			if (bis != null) {
				bis.close();
			}
			return temp.toString();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
