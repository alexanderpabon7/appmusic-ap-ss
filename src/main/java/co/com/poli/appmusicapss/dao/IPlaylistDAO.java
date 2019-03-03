package co.com.poli.appmusicapss.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.poli.appmusicapss.model.Playlist;

public interface IPlaylistDAO extends CrudRepository<Playlist, Integer> {

}
