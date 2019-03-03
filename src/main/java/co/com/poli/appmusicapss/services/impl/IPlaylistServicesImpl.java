package co.com.poli.appmusicapss.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.poli.appmusicapss.dao.IPlaylistDAO;
import co.com.poli.appmusicapss.model.Playlist;
import co.com.poli.appmusicapss.services.IPlaylistServices;

@Service
public class IPlaylistServicesImpl implements IPlaylistServices {

    @Autowired
    private IPlaylistDAO playlistDAO;

    @Override
    @Transactional
    public boolean createPlaylist(Playlist playlist) {
        try {
            playlistDAO.save(playlist);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    @Override
    @Transactional(readOnly = false)
    public List<Playlist> findAllPlaylist() {
        return (List<Playlist>) playlistDAO.findAll();
    }

    @Override
    @Transactional
    public boolean updatePlaylist(Playlist playlist) {
        try {
            playlistDAO.save(playlist);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    @Override
    @Transactional
    public boolean deletePlaylist(Playlist playlist) {
        try {
            playlistDAO.delete(playlist);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

}
