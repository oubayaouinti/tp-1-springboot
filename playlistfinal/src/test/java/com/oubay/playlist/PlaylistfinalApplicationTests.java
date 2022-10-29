package com.oubay.playlist;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.oubay.playlist.entities.Song;
import com.oubay.playlist.repos.SongRepository;
import com.oubay.playlist.entities.Genre;


@SpringBootTest
class PlaylistfinalApplicationTests {

	@Autowired
	private SongRepository songRepository;
	
	@Test
	public void testCreateSong() {
	Song son = new Song("badguy", "billieeilish",new Date());
	songRepository.save(son);
	}
	
	@Test
	public void testFindSong() 
	{
		Song s = songRepository.findById(1L).get();
		System.out.println(s);
	}
	
	
	@Test
	public void testUpdateSong() {
		Song s = songRepository.findById(1L).get();
		s.setArtistName("Em");
		songRepository.save(s);
		System.out.println(s);
	}
	
	@Test
	public void testDeleteSong() 
	{
		songRepository.deleteById(1L);
	}
	
	
	@Test
	public void testfindAllSongs() 
	{
		List<Song> sons = songRepository.findAll();
		for(Song s:sons)
			System.out.println(s);
	}
	
	@Test
	public void testFindSongByName() 
	{
		List<Song> sons = songRepository.findBySongName("killer remix");
		for(Song s:sons)
			System.out.println(s);
	}
	
	@Test
	public void testFindSongByNameContains() 
	{
		List<Song> sons = songRepository.findBySongNameContains("k");
		for(Song s:sons)
			System.out.println(s);
	}
	
	@Test
	public void testfindBySonArtName()
	{
		List<Song> sons = songRepository.findBySonArtName("till i collapse", "eminem");
		for (Song s : sons)
		
			System.out.println(s);	
	}
	
	
	@Test
	public void testfindByGenre()
	{
	Genre gen = new Genre();
	gen.setIdGen(2L);
	List<Song> sons = songRepository.findByGenre(gen);
	for (Song s : sons)
	{
	System.out.println(s);
	}
	}
	
	@Test
	public void findByGenreIdGen()
	{
	List<Song> sons = songRepository.findByGenreIdGen(1L);
	for (Song s : sons)
	{
	System.out.println(s);
	}
	 }
	
	@Test
	public void testfindByOrderBySongNameAsc()
	{
	List<Song> sons = songRepository.findByOrderBySongNameAsc();
	for (Song s : sons)
	{
	System.out.println(s);
	}
	}
	
	@Test
	public void testtrierSongsSonArt() {
		List<Song> sons = songRepository.trierSongsSonArt();
		for (Song s : sons)
		{
		System.out.println(s);
		}
	}

}
