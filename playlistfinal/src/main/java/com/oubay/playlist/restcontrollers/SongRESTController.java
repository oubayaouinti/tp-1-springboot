package com.oubay.playlist.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oubay.playlist.entities.Song;
import com.oubay.playlist.service.SongService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class SongRESTController {

	
	@Autowired
	SongService songService;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Song> getAllSongs()
	{
		return songService.getAllSongs();
	}
	
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Song getSongById(@PathVariable("id")Long id){
		return songService.getSong(id);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Song createSong(@RequestBody Song song){
		return songService.saveSong(song);
	}
	
}
