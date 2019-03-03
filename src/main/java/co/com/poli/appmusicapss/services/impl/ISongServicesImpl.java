package co.com.poli.appmusicapss.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.poli.appmusicapss.dao.ISongDAO;
import co.com.poli.appmusicapss.model.Song;
import co.com.poli.appmusicapss.services.ISongServices;

@Service
public class ISongServicesImpl implements ISongServices {

    @Autowired
    private ISongDAO songDAO;

    @Override
    @Transactional
    public boolean createSong(Song song) {
        try {
            songDAO.save(song);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    @Override
    @Transactional(readOnly = false)
    public List<Song> findAllSong() {
        return (List<Song>) songDAO.findAll();
    }

    @Override
    @Transactional
    public boolean updateSong(Song song) {
        try {
            songDAO.save(song);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    @Override
    @Transactional
    public boolean deleteSong(Song song) {
        try {
            songDAO.delete(song);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

}
