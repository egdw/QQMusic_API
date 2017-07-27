package com.model;

public class Lrc {
	private int retcode;

	private int code;

	private int subcode;

	private String lyric;

	private String trans;

	public void setRetcode(int retcode) {
		this.retcode = retcode;
	}

	public int getRetcode() {
		return this.retcode;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getCode() {
		return this.code;
	}

	public void setSubcode(int subcode) {
		this.subcode = subcode;
	}

	public int getSubcode() {
		return this.subcode;
	}

	public void setLyric(String lyric) {
		this.lyric = lyric;
	}

	public String getLyric() {
		return this.lyric;
	}

	public void setTrans(String trans) {
		this.trans = trans;
	}

	public String getTrans() {
		return this.trans;
	}

	@Override
	public String toString() {
		return "Lrc [retcode=" + retcode + ", code=" + code + ", subcode=" + subcode + ", lyric=" + lyric + ", trans="
				+ trans + "]";
	}

}
