package com.test;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

import com.alibaba.fastjson.JSON;
import com.model.Music;

public class QQMusic {

	/**
	 * 音乐搜索
	 * 
	 * @param keyWord
	 *            关键词
	 * @param page
	 *            页码
	 * @return
	 * @throws IOException
	 * @num 查询数量
	 */
	public Music searchMusic(String keyWord, int page, int num) throws IOException {
		// String u1 = "https://c.y.qq.com/soso/fcgi-bin/client_search_cp";
		StringBuilder sb = new StringBuilder("https://c.y.qq.com/soso/fcgi-bin/client_search_cp");
		StringBuilder append = sb.append("?new_json=1&aggr=1&cr=1&flag_qc=0&p=").append(page).append("&n=").append(num)
				.append("&w=").append(keyWord);
		// url += '?new_json=1&aggr=1&cr=1&flag_qc=0&p=%d&n=%d&w=%s' \
		// % (page, num, urllib.quote(key_word))
		URL url = new URL(append.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoInput(true);
		conn.setDoOutput(true);
		conn.setConnectTimeout(5000);
		BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
		byte[] bytes = new byte[512];
		int len = -1;
		StringBuilder temp = new StringBuilder();
		while ((len = bis.read(bytes)) != -1) {
			temp.append(new String(bytes, 0, len));
		}
		bis.close();
		Music music = JSON.parseObject(temp.toString().substring(9, temp.toString().length() - 1), Music.class);
		return music;
	}

	/**
	 * 字符串转换unicode
	 */
	public String string2Unicode(String string) {
		StringBuffer unicode = new StringBuffer();
		for (int i = 0; i < string.length(); i++) {
			// 取出每一个字符
			char c = string.charAt(i);
			// 转换为unicode
			unicode.append("\\u" + Integer.toHexString(c));
		}
		return unicode.toString();
	}
}
