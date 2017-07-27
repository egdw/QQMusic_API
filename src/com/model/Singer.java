package com.model;

/**
 * Auto-generated: 2017-07-22 23:53:2
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Singer {

	private int id;
	private String mid;
	private String name;
	private String title;
	private String titleHilight;
	private int type;
	private int uin;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMid() {
		return mid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitleHilight(String titleHilight) {
		this.titleHilight = titleHilight;
	}

	public String getTitleHilight() {
		return titleHilight;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setUin(int uin) {
		this.uin = uin;
	}

	public int getUin() {
		return uin;
	}

	@Override
	public String toString() {
		return "Singer [id=" + id + ", mid=" + mid + ", name=" + name + ", title=" + title + ", titleHilight="
				+ titleHilight + ", type=" + type + ", uin=" + uin + "]";
	}

}