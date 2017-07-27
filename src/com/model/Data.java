package com.model;

import java.util.List;

/**
 * Auto-generated: 2017-07-22 23:53:2
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Data {

	private String keyword;
	private int priority;
	private List<String> qc;
	private Semantic semantic;
	private Song song;
	private List<String> taglist;
	private int totaltime;
	private Zhida zhida;

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getPriority() {
		return priority;
	}

	public void setQc(List<String> qc) {
		this.qc = qc;
	}

	public List<String> getQc() {
		return qc;
	}

	public void setSemantic(Semantic semantic) {
		this.semantic = semantic;
	}

	public Semantic getSemantic() {
		return semantic;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	public Song getSong() {
		return song;
	}

	public void setTaglist(List<String> taglist) {
		this.taglist = taglist;
	}

	public List<String> getTaglist() {
		return taglist;
	}

	public void setTotaltime(int totaltime) {
		this.totaltime = totaltime;
	}

	public int getTotaltime() {
		return totaltime;
	}

	public void setZhida(Zhida zhida) {
		this.zhida = zhida;
	}

	public Zhida getZhida() {
		return zhida;
	}

	@Override
	public String toString() {
		return "Data [keyword=" + keyword + ", priority=" + priority + ", qc=" + qc + ", semantic=" + semantic
				+ ", song=" + song + ", taglist=" + taglist + ", totaltime=" + totaltime + ", zhida=" + zhida + "]";
	}
	
	
}