package co.com.poli.appmusicapss.services;

import java.util.List;

import co.com.poli.appmusicapss.model.Playlist;

public interface IPlaylistServices {

	boolean createPlaylist(Playlist playlist);

	List<Playlist> findAllPlaylist();

	boolean updatePlaylist(Playlist playlist);

	boolean deletePlaylist(Playlist playlist);

}
