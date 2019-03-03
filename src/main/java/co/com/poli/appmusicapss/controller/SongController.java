package co.com.poli.appmusicapss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import co.com.poli.appmusicapss.model.Song;
import co.com.poli.appmusicapss.path.Path.SongPath;
import co.com.poli.appmusicapss.services.ISongServices;
import co.com.poli.appmusicapss.util.Response;

@RestController
public class SongController {

    @Autowired
    private ISongServices songServices;

    @GetMapping(SongPath.SONG)
    public Response findAllSong() {
        Response response;
        try {
            response = responseMet(songServices.findAllSong(), "Get", 201, Boolean.TRUE);
        } catch (Exception e) {
            response = responseMet(null, e.getMessage(), 404, Boolean.FALSE);
        }
        return response;
    }

    @GetMapping(SongPath.SONG_ID)
    public Response findSong() {
        Response response;
        try {
            response = responseMet(songServices.findAllSong(), "Get id", 201, Boolean.TRUE);
        } catch (Exception e) {
            response = responseMet(null, e.getMessage(), 404, Boolean.FALSE);
        }
        return response;
    }

    @PostMapping(SongPath.SONG)
    public Response createSong(@RequestBody Song song) {
        Response response;
        try {
            boolean result = songServices.createSong(song);
            response = responseMet(songServices.findAllSong(), "Created", 201, Boolean.TRUE);
        } catch (Exception e) {
            response = responseMet(null, e.getMessage(), 404, Boolean.FALSE);
        }
        return response;
    }

    @PutMapping(SongPath.SONG)
    public Response updateSong(@RequestBody Song song) {
        Response response;
        try {
            boolean result = songServices.updateSong(song);
            response = responseMet(songServices.findAllSong(), "Updated", 204, Boolean.TRUE);
        } catch (Exception e) {
            response = responseMet(null, e.getMessage(), 404, Boolean.FALSE);
        }
        return response;
    }

    @DeleteMapping(SongPath.SONG_ID)
    public Response deleteSong(@RequestBody Song song) {
        Response response;
        try {
            boolean result = songServices.deleteSong(song);
            response = responseMet(songServices.findAllSong(), "Deleted", 204, Boolean.TRUE);
        } catch (Exception e) {
            response = responseMet(null, e.getMessage(), 404, Boolean.FALSE);
        }
        return response;
    }

    public Response responseMet(Object responseBody, String message, int codeResponse, boolean status) {
        Response response = new Response();

        response.setResponseBody(responseBody);
        response.setMessage(message);
        response.setCodeResponse(codeResponse);
        response.setStatus(status);

        return response;
    }

}
