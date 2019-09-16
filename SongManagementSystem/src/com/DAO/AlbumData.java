package com.DAO;

import java.util.ArrayList;
import java.util.HashMap;

import com.bean.Album;
import com.bean.Song;

public interface AlbumData {
	
	public int getTotalSongDownloadsForAlbum(int albumId);
	public ArrayList<Song> retrieveSongBasedOnSingerName(String singerName);
	public Album retriveAlbumWithMaxAlbumRate();
	public HashMap<String, Integer> getNoOfSongByComposer();

}
