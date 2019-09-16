package com.bean;

public class Song {
	private int songId;
	private int albumId;
	private String singerName;
	private double duration;
	private int noOfDownloads;
	
	
	public Song(int songId, int albumId, String singerName, double duration, int noOfDownloads) {
		super();
		this.songId = songId;
		this.albumId = albumId;
		this.singerName = singerName;
		this.duration = duration;
		this.noOfDownloads = noOfDownloads;
	}
	
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public int getNoOfDownloads() {
		return noOfDownloads;
	}
	public void setNoOfDownloads(int noOfDownloads) {
		this.noOfDownloads = noOfDownloads;
	}
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}

	@Override
	public String toString() {
		return "Song [songId=" + songId + ", albumId=" + albumId + ", singerName=" + singerName + ", duration="
				+ duration + ", noOfDownloads=" + noOfDownloads + "]";
	}
	
	
	
}
