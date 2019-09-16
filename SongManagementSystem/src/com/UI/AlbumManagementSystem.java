package com.UI;

import java.util.List;
import java.util.Scanner;

import com.DAO.AlbumDaoFactroy;
import com.DAO.AlbumData;
import com.bean.Song;

public class AlbumManagementSystem {
	
	private static AlbumData albumDao = AlbumDaoFactroy.getAlbumFactoryInstance().getAlbumStorage("Oracle");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---------->> Album Management System <<-------------");
		
		while(true) {
			
			System.out.println("1. Get the total number of songs downloaded for that album.");
			System.out.println("2. Find songs by the singer name.");
			System.out.println("3. Find the album with maximum rating.");
			System.out.println("4. Find the number of songs by the singer.");
			System.out.println("5. Exit.");
			
			@SuppressWarnings("resource")
			Scanner scan1 = new Scanner(System.in);
			int choice = scan1.nextInt();
			
			switch(choice) {
			case 1:
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Enter the Album ID: ");
				int album_id = albumDao.getTotalSongDownloadsForAlbum(scan2.nextInt());
				System.out.println(album_id);
				break;
			
			case 2:
				Scanner scan3 = new Scanner(System.in);
				System.out.println("Enter the singer name: ");
				List<Song> songList = albumDao.retrieveSongBasedOnSingerName(scan3.nextLine());
				System.out.println(songList);
				
				break;
				
			case 3:
				Scanner scan4 = new Scanner(System.in);
				
				break;
				
			case 4:
				
				break;
				
			case 5:
				System.out.println("<<< Thank you for using Album Management System >>>>");
				System.exit(0);
				break;
			}
			
		}
		

	}

}
