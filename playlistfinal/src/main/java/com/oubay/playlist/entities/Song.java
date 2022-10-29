package com.oubay.playlist.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSong;
	private String songName;
	private String artistName;
	private Date releaseDate;
	
	
	@ManyToOne
	private Genre genre;
	
	
	
	
	
	public Song(String songName, String artistName, Date releaseDate) {
		super();
		songName = songName;
		artistName = artistName;
		releaseDate = releaseDate;
	}
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdSong() {
		return idSong;
	}
	public void setIdSong(Long idSong) {
		this.idSong = idSong;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		songName = songName;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		artistName = artistName;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		releaseDate = releaseDate;
	}
	@Override
	public String toString() {
		return "Song [idSong=" + idSong + ", SongName=" + songName + ", ArtistName=" + artistName + ", ReleaseDate="
				+ releaseDate + "]";
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}


}
