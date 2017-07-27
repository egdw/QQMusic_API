package com.test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URLEncoder;

import com.model.Music;

public class Test {
	public static void main(String[] args) {
		QQMusic music = new QQMusic();
		try {
			Music searchMusic = music.searchMusic(URLEncoder.encode("the last time"), 1, 20);
			QQMusicSong song = new QQMusicSong(searchMusic);
			song.getVKey();
			song.musicSave("/Users/hdy/Downloads/music");
			song.saveLrc("/Users/hdy/Downloads/music");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
