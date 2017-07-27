package com.model;

import java.util.List;

/**
 * Auto-generated: 2017-07-22 23:53:2
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Semantic {

	private int curnum;
	private int curpage;
	private List<String> list;
	private int totalnum;

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

	public void setList(List<String> list) {
		this.list = list;
	}

	public List<String> getList() {
		return list;
	}

	public void setTotalnum(int totalnum) {
		this.totalnum = totalnum;
	}

	public int getTotalnum() {
		return totalnum;
	}

	@Override
	public String toString() {
		return "Semantic [curnum=" + curnum + ", curpage=" + curpage + ", list=" + list + ", totalnum=" + totalnum
				+ "]";
	}

}