package com.model;

/**
 * Auto-generated: 2017-07-22 23:53:2
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Album {

	private int id;
	private String mid;
	private String name;
	private String subtitle;
	private String title;
	private String title_hilight;

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

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitleHilight(String titleHilight) {
		this.title_hilight = titleHilight;
	}

	public String getTitleHilight() {
		return title_hilight;
	}

	@Override
	public String toString() {
		return "Album [id=" + id + ", mid=" + mid + ", name=" + name + ", subtitle=" + subtitle + ", title=" + title
				+ ", title_hilight=" + title_hilight + "]";
	}

}