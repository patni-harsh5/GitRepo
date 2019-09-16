package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.Utility.DatabaseUtil;
import com.bean.Album;
import com.bean.Song;

public class AlbumManagementDao implements AlbumData {
	
	public int getTotalSongDownloadsForAlbum(int albumId) {
		Connection conn = null;
		int totalDownloads = -1;
		try {
			conn  = DatabaseUtil.getConnect();
			
			String query = "select sum(song_downloads) from song where album_id = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, albumId);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			
			totalDownloads = rs.getInt("sum(song_downloads)");
			
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				DatabaseUtil.closeConnection(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return totalDownloads;
	}
	
	public ArrayList<Song> retrieveSongBasedOnSingerName(String singerName){
		ArrayList<Song> filteredList = new ArrayList<Song>();
		Song song = null;
		
		Connection conn = null;
		try {
			conn  = DatabaseUtil.getConnect();
			String query = "select * from Song where song_singer_name = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1,singerName);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {

			int songId = rs.getInt("song_id");
			int album_id = rs.getInt("album_id");
			String sName = rs.getString("song_singer_name");
			double  duration = rs.getDouble("song_duration");
			int downLoads = rs.getInt("song_downloads");
			
			song = new Song(songId, album_id, sName,duration, downLoads);
			
			filteredList.add(song);
			
			
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				DatabaseUtil.closeConnection(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return filteredList;
	}
	
	public Album retriveAlbumWithMaxAlbumRate() {
		Album albObj = null;
				
		Connection conn = null;
		try {
			conn  = DatabaseUtil.getConnect();
			String query = "select * from Album where album_rating in (select max(album_rating) from Album)";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			
//			pstmt.setString(1,singerName);
			
			ResultSet rs = pstmt.executeQuery();
			
			rs.next();

			int albumId = rs.getInt("album_id");
			String albumName = rs.getString("album_name");
			String albumComp = rs.getString("album_Comp");
			String  albumType = rs.getString("album_type");
			float albumRating = rs.getFloat("album_rating");
			
			albObj = new Album(albumId, albumName, albumComp,albumType, albumRating);
			
			
			
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				DatabaseUtil.closeConnection(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return albObj;
	}
	
	public HashMap<String, Integer> getNoOfSongByComposer(){
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		
		return hmap;
	}

}
