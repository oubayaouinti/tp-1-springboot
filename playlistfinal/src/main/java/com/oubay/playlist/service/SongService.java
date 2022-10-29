package com.oubay.playlist.service;

import java.util.List;

import com.oubay.playlist.entities.Genre;
import com.oubay.playlist.entities.Song;

public interface SongService {
	Song saveSong(Song s);
	Song updateSong(Song s);
	void deleteSong(Song s);
	void deleteSongById(Long id);
	Song getSong(Long id);
	List<Song> getAllSongs();
	
	List<Song> findBySongName(String name);
	List<Song> findBySongNameContains(String name);
	List<Song> findBySonArtName (String name, String artName);
List<Song> findByGenre(Genre genre);
	
	List<Song> findByGenreIdGen(Long id);
	
	List<Song> findByOrderBySongNameAsc();
	List<Song> trierSongsSonArt();
}
