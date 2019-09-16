package com.bean;

public class Album {
	
	private String albumName;
	private String albumComposser;
	private String albumType;
	private float albumRating;
	
	private int albumId;public Album(int albumId, String albumName, String albumComposser, String albumType, float albumRating) {
		super();
		this.albumId = albumId;
		this.albumName = albumName;
		this.albumComposser = albumComposser;
		this.albumType = albumType;
		this.albumRating = albumRating;
	}
	
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getAlbumComposser() {
		return albumComposser;
	}
	public void setAlbumComposser(String albumComposser) {
		this.albumComposser = albumComposser;
	}
	public String getAlbumType() {
		return albumType;
	}
	public void setAlbumType(String albumType) {
		this.albumType = albumType;
	}
	public float getAlbumRating() {
		return albumRating;
	}
	public void setAlbumRating(float albumRating) {
		this.albumRating = albumRating;
	}
	

}
