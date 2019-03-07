package co.com.poli.appmusicapss.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "songs")
public class Song implements Serializable {
	
    private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty
	private String album;

	@NotEmpty
	private String artist;

	@NotEmpty
	private String title;

	@NotEmpty
	private String yearsong;

	@JsonBackReference
    //bi-directional many-to-one association to Playlist
    @ManyToOne(fetch = FetchType.LAZY)
    private Playlist playlist;

	public Song() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAlbum() {
		return this.album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getArtist() {
		return this.artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYearsong() {
		return this.yearsong;
	}

	public void setYearsong(String yearsong) {
		this.yearsong = yearsong;
	}

	public Playlist getPlaylist() {
		return this.playlist;
	}

	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}

}
