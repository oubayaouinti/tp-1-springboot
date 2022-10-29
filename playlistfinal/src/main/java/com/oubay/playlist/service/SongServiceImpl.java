package com.oubay.playlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oubay.playlist.entities.Genre;
import com.oubay.playlist.entities.Song;
import com.oubay.playlist.repos.SongRepository;



@Service
public class SongServiceImpl implements SongService{

	
	@Autowired
	SongRepository songRepository;
	
	@Override
	public Song saveSong(Song s) {
		return songRepository.save(s);
	}

	@Override
	public Song updateSong(Song s) {
		return songRepository.save(s);
	}

	@Override
	public void deleteSong(Song s) {
		songRepository.delete(s);
		
	}

	@Override
	public void deleteSongById(Long id) {
		songRepository.deleteById(id);
		
	}

	@Override
	public Song getSong(Long id) {
		return songRepository.findById(id).get();
	}

	@Override
	public List<Song> getAllSongs() {
		return songRepository.findAll();
	}

	@Override
	public List<Song> findBySongName(String name) {
		
		return songRepository.findBySongName(name) ;
	}

	@Override
	public List<Song> findBySongNameContains(String name) {
		
		return songRepository.findBySongNameContains(name);
	}

	@Override
	public List<Song> findBySonArtName(String name, String artName) {
		
		return songRepository.findBySonArtName(name, artName);
	}

	@Override
	public List<Song> findByGenre(Genre genre) {
		
		return songRepository.findByGenre(genre);
	}

	@Override
	public List<Song> findByGenreIdGen(Long id) {
		
		return songRepository.findByGenreIdGen(id);
	}

	@Override
	public List<Song> findByOrderBySongNameAsc() {
		
		return songRepository.findByOrderBySongNameAsc();
	}

	@Override
	public List<Song> trierSongsSonArt() {
		
		return songRepository.trierSongsSonArt();
	}

}
