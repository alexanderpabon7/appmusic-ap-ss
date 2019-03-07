package co.com.poli.appmusicapss.controller;

import java.util.List;

import co.com.poli.appmusicapss.dao.IPlaylistDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import co.com.poli.appmusicapss.model.Playlist;
import co.com.poli.appmusicapss.path.Path.PlaylistPath;
import co.com.poli.appmusicapss.services.IPlaylistServices;
import co.com.poli.appmusicapss.util.Response;

@RestController
public class PlaylistController {

	@Autowired
	private IPlaylistServices playlistServices;
	@Autowired
	private IPlaylistDAO playlistDAO;

	@GetMapping(PlaylistPath.PLAYLIST)
	public Response findAllPlaylist() {
		Response response;
		try {
			response = responseMet(playlistDAO.findAll(), "Get", 200, Boolean.TRUE);
		} catch (Exception e) {
			response = responseMet(null, e.getMessage(), 404, Boolean.FALSE);
		}
		return response;
	}

	@GetMapping(PlaylistPath.PLAYLIST_ID)
	public Response findPlaylist() {
		Response response;
		try {
			response = responseMet(playlistServices.findAllPlaylist(), "Get id", 200, Boolean.TRUE);
		} catch (Exception e) {
			response = responseMet(null, e.getMessage(), 404, Boolean.FALSE);
		}
		return response;
	}
	
	@PostMapping(PlaylistPath.PLAYLIST)
	public Response createPlaylist(@RequestBody Playlist playlist) {
		Response response;
		try {
			boolean result = playlistServices.createPlaylist(playlist);
			response = responseMet(playlistServices.findAllPlaylist(), "Created", 201, Boolean.TRUE);
		} catch (Exception e) {
			response = responseMet(null, e.getMessage(), 400, Boolean.FALSE);
		}
		return response;
	}

	@PutMapping(PlaylistPath.PLAYLIST)
	public Response updatePlaylist(@RequestBody Playlist playlist) {
		Response response;
		try {
			boolean result = playlistServices.updatePlaylist(playlist);
			response = responseMet(playlistServices.findAllPlaylist(), "Updated", 204, Boolean.TRUE);
		} catch (Exception e) {
			response = responseMet(null, e.getMessage(), 404, Boolean.FALSE);
		}
		return response;
	}

	@DeleteMapping(PlaylistPath.PLAYLIST_ID)
	public Response deletePlaylist(@RequestBody Playlist playlist) {
		Response response;
		try {
			boolean result = playlistServices.deletePlaylist(playlist);
			response = responseMet(playlistServices.findAllPlaylist(), "Deleted", 204, Boolean.TRUE);
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
