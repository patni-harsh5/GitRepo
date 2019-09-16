package com.DAO;

public class AlbumDaoFactroy {
	
	private static AlbumDaoFactroy albumFactory = null;
	
	private AlbumDaoFactroy() {
	}
	
	public static AlbumDaoFactroy getAlbumFactoryInstance() {
		if(albumFactory == null) {
			albumFactory = new AlbumDaoFactroy();
		}
		
		return albumFactory;
	}
	
	public AlbumData getAlbumStorage(String storageMedium) {
		AlbumData albumData = null;
		
		if("Oracle".equals(storageMedium)) {
			albumData = new AlbumManagementDao();
		}
		
		return albumData;
	}
	

}
