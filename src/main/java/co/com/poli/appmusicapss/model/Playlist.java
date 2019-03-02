package co.com.poli.appmusicapss.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Playlist.findAll", query="SELECT p FROM Playlist p")
public class Playlist implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="playlist_id")
	private Integer playlistId;

	@Column(name="name_playlist")
	private String namePlaylist;

	@Column(name="song_id")
	private Long songId;

	public Playlist() {
	}

	public Integer getPlaylistId() {
		return this.playlistId;
	}

	public void setPlaylistId(Integer playlistId) {
		this.playlistId = playlistId;
	}

	public String getNamePlaylist() {
		return this.namePlaylist;
	}

	public void setNamePlaylist(String namePlaylist) {
		this.namePlaylist = namePlaylist;
	}

	public Long getSongId() {
		return this.songId;
	}

	public void setSongId(Long songId) {
		this.songId = songId;
	}
	
}
