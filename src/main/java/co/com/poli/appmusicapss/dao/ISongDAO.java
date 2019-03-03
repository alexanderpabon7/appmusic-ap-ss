package co.com.poli.appmusicapss.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.poli.appmusicapss.model.Song;

public interface ISongDAO extends CrudRepository<Song, Integer> {

}
