package com.oubay.playlist.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oubay.playlist.entities.Genre;
import com.oubay.playlist.entities.Song;

public interface SongRepository extends JpaRepository<Song, Long> {
	List<Song> findBySongName(String name);
	List<Song> findBySongNameContains(String name);
	
	@Query("select s from Song s where s.songName like %?1 and s.artistName like %?2")
	List<Song> findBySonArtName (String name, String artName);
	
	@Query("select s from Song s where s.genre = ?1")
	List<Song> findByGenre(Genre genre);
	
	List<Song> findByGenreIdGen(Long id);
	
	List<Song> findByOrderBySongNameAsc();
	
	
	@Query("select s from Song s order by s.songName ASC, s.artistName DESC")
	List<Song> trierSongsSonArt();
	
}
