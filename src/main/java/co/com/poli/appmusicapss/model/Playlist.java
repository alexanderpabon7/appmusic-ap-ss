package co.com.poli.appmusicapss.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="playlists")
public class Playlist implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty
	private String description;

	@NotEmpty
	private String name;
	
	@JsonManagedReference
	//bi-directional many-to-one association to Song
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id")
	private List<Song> songs;

	public Playlist() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Song> getSongs() {
		return this.songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

	public Song addSong(Song song) {
		getSongs().add(song);
		song.setPlaylist(this);

		return song;
	}

	public Song removeSong(Song song) {
		getSongs().remove(song);
		song.setPlaylist(null);

		return song;
	}
}