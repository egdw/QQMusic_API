package com.model;

/**
 * Auto-generated: 2017-07-22 23:53:2
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class File {

	private String media_mid;
	private int size_128;
	private int size_320;
	private int size_aac;
	private int size_ape;
	private int size_dts;
	private int size_flac;
	private int size_ogg;
	private int size_try;
	private String strMediaMid;
	private int try_begin;
	private int try_end;

	public void setMediaMid(String mediaMid) {
		this.media_mid = mediaMid;
	}

	public String getMediaMid() {
		return media_mid;
	}

	public void setSize128(int size128) {
		this.size_128 = size128;
	}

	public int getSize128() {
		return size_128;
	}

	public void setSize320(int size320) {
		this.size_320 = size320;
	}

	public int getSize320() {
		return size_320;
	}

	public void setSizeAac(int sizeAac) {
		this.size_aac = sizeAac;
	}

	public int getSizeAac() {
		return size_aac;
	}

	public void setSizeApe(int sizeApe) {
		this.size_ape = sizeApe;
	}

	public int getSizeApe() {
		return size_ape;
	}

	public void setSizeDts(int sizeDts) {
		this.size_dts = sizeDts;
	}

	public int getSizeDts() {
		return size_dts;
	}

	public void setSizeFlac(int sizeFlac) {
		this.size_flac = sizeFlac;
	}

	public int getSizeFlac() {
		return size_flac;
	}

	public void setSizeOgg(int sizeOgg) {
		this.size_ogg = sizeOgg;
	}

	public int getSizeOgg() {
		return size_ogg;
	}

	public void setSizeTry(int sizeTry) {
		this.size_try = sizeTry;
	}

	public int getSizeTry() {
		return size_try;
	}

	public void setStrmediamid(String strmediamid) {
		this.strMediaMid = strmediamid;
	}

	public String getStrmediamid() {
		return strMediaMid;
	}

	public void setTryBegin(int tryBegin) {
		this.try_begin = tryBegin;
	}

	public int getTryBegin() {
		return try_begin;
	}

	public void setTryEnd(int tryEnd) {
		this.try_end = tryEnd;
	}

	public int getTryEnd() {
		return try_end;
	}

	@Override
	public String toString() {
		return "File [media_mid=" + media_mid + ", size_128=" + size_128 + ", size_320=" + size_320 + ", size_aac="
				+ size_aac + ", size_ape=" + size_ape + ", size_dts=" + size_dts + ", size_flac=" + size_flac
				+ ", size_ogg=" + size_ogg + ", size_try=" + size_try + ", strMediaMid=" + strMediaMid + ", try_begin="
				+ try_begin + ", try_end=" + try_end + "]";
	}

}