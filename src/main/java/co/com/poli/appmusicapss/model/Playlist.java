package co.com.poli.appmusicapss.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "playlist")
public class Playlist implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long playlistId;

	@NotEmpty
	private String namePlaylist;

	@JsonManagedReference
	@OneToMany(mappedBy = "playlist", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Song> songs;

	public Playlist() {
	}

	public Long getPlaylistId() {
		return this.playlistId;
	}

	public void setPlaylistId(Long playlistId) {
		this.playlistId = playlistId;
	}

	public String getNamePlaylist() {
		return this.namePlaylist;
	}

	public void setNamePlaylist(String namePlaylist) {
		this.namePlaylist = namePlaylist;
	}

	public List<Song> getSongId() {
		return this.songs;
	}

	public void setSongId(List<Song> songs) {
		this.songs = songs;
	}

}
