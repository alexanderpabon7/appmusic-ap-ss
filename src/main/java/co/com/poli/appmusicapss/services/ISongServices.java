package co.com.poli.appmusicapss.services;

import java.util.List;

import co.com.poli.appmusicapss.model.Song;

public interface ISongServices {

	boolean createSong(Song song);
	
	List<Song> findAllSong();

	boolean updateSong(Song song);

	boolean deleteSong(Song song);
	
}
