package co.com.poli.appmusicapss.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(name="Song.findAll", query="SELECT s FROM Song s")
public class Song implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="song_id")
	private Integer songId;

	@Column(name="\"album_ song\"")
	private String albumSong;

	@Column(name="\"artist_ song\"")
	private String artistSong;

	@Column(name="\"title_ song\"")
	private String titleSong;

	@Temporal(TemporalType.DATE)
	@Column(name="\"year_ song\"")
	private Date yearSong;

	public Song() {
	}

	public Integer getSongId() {
		return this.songId;
	}

	public void setSongId(Integer songId) {
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

}
