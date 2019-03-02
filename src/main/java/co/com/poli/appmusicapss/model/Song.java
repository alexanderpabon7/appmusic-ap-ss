package co.com.poli.appmusicapss.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "song")
public class Song implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long songId;

	@NotEmpty
	private String albumSong;

	private String artistSong;

	private String titleSong;

	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(name="year_ song")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date yearSong;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	private Playlist playlist;

	public Song() {
	}

	public Long getSongId() {
		return this.songId;
	}

	public void setSongId(Long songId) {
		this.songId = songId;
	}

	public String getAlbumSong() {
		return this.albumSong;
	}

	public void setAlbumSong(String albumSong) {
		this.albumSong = albumSong;
	}

	public String getArtistSong() {
		return this.artistSong;
	}

	public void setArtistSong(String artistSong) {
		this.artistSong = artistSong;
	}

	public String getTitleSong() {
		return this.titleSong;
	}

	public void setTitleSong(String titleSong) {
		this.titleSong = titleSong;
	}

	public Date getYearSong() {
		return this.yearSong;
	}

	public void setYearSong(Date yearSong) {
		this.yearSong = yearSong;
	}

	public Playlist getPlaylist() {
		return this.playlist;
	}

	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
}
