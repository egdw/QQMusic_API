package com.model;

import java.util.List;

/**
 * Auto-generated: 2017-07-22 23:53:2
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Song {
	private int id;
	private int index_album;
	private int index_cd;
	private int interval;
	private int isonly;
	private int curnum;
	private int curpage;
	private List<com.model.List> list;
	private int totalnum;
	private Ksong ksong;
	private int language;
	private String lyric;
	private String lyric_hilight;
	private String mid;
	private Mv mv;
	private String name;
	private int newStatus;
	private long nt;
	private Pay pay;
	private int pure;
	private List<Singer> singer;
	private int status;
	private String subtitle;
	private int t;
	private int tag;
	private String time_public;
	private String title;
	private String title_hilight;
	private int type;
	private String url;
	private int ver;
	private Volume volume;
	private File file;

	public void setCurnum(int curnum) {
		this.curnum = curnum;
	}

	public int getCurnum() {
		return curnum;
	}

	public void setCurpage(int curpage) {
		this.curpage = curpage;
	}

	public int getCurpage() {
		return curpage;
	}

	public void setList(List<com.model.List> list) {
		this.list = list;
	}

	public List<com.model.List> getList() {
		return list;
	}

	public void setTotalnum(int totalnum) {
		this.totalnum = totalnum;
	}

	public int getTotalnum() {
		return totalnum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIndex_album() {
		return index_album;
	}

	public void setIndex_album(int index_album) {
		this.index_album = index_album;
	}

	public int getIndex_cd() {
		return index_cd;
	}

	public void setIndex_cd(int index_cd) {
		this.index_cd = index_cd;
	}

	public int getInterval() {
		return interval;
	}

	public void setInterval(int interval) {
		this.interval = interval;
	}

	public int getIsonly() {
		return isonly;
	}

	public void setIsonly(int isonly) {
		this.isonly = isonly;
	}

	public Ksong getKsong() {
		return ksong;
	}

	public void setKsong(Ksong ksong) {
		this.ksong = ksong;
	}

	public int getLanguage() {
		return language;
	}

	public void setLanguage(int language) {
		this.language = language;
	}

	public String getLyric() {
		return lyric;
	}

	public void setLyric(String lyric) {
		this.lyric = lyric;
	}

	public String getLyric_hilight() {
		return lyric_hilight;
	}

	public void setLyric_hilight(String lyric_hilight) {
		this.lyric_hilight = lyric_hilight;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public Mv getMv() {
		return mv;
	}

	public void setMv(Mv mv) {
		this.mv = mv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNewStatus() {
		return newStatus;
	}

	public void setNewStatus(int newStatus) {
		this.newStatus = newStatus;
	}

	public long getNt() {
		return nt;
	}

	public void setNt(long nt) {
		this.nt = nt;
	}

	public Pay getPay() {
		return pay;
	}

	public void setPay(Pay pay) {
		this.pay = pay;
	}

	public int getPure() {
		return pure;
	}

	public void setPure(int pure) {
		this.pure = pure;
	}

	public List<Singer> getSinger() {
		return singer;
	}

	public void setSinger(List<Singer> singer) {
		this.singer = singer;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public String getTime_public() {
		return time_public;
	}

	public void setTime_public(String time_public) {
		this.time_public = time_public;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle_hilight() {
		return title_hilight;
	}

	public void setTitle_hilight(String title_hilight) {
		this.title_hilight = title_hilight;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getVer() {
		return ver;
	}

	public void setVer(int ver) {
		this.ver = ver;
	}

	public Volume getVolume() {
		return volume;
	}

	public void setVolume(Volume volume) {
		this.volume = volume;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", index_album=" + index_album + ", index_cd=" + index_cd + ", interval=" + interval
				+ ", isonly=" + isonly + ", curnum=" + curnum + ", curpage=" + curpage + ", list=" + list
				+ ", totalnum=" + totalnum + ", ksong=" + ksong + ", language=" + language + ", lyric=" + lyric
				+ ", lyric_hilight=" + lyric_hilight + ", mid=" + mid + ", mv=" + mv + ", name=" + name + ", newStatus="
				+ newStatus + ", nt=" + nt + ", pay=" + pay + ", pure=" + pure + ", singer=" + singer + ", status="
				+ status + ", subtitle=" + subtitle + ", t=" + t + ", tag=" + tag + ", time_public=" + time_public
				+ ", title=" + title + ", title_hilight=" + title_hilight + ", type=" + type + ", url=" + url + ", ver="
				+ ver + ", volume=" + volume + ", file=" + file + "]";
	}

}