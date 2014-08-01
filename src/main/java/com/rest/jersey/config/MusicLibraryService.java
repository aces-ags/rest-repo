package com.rest.jersey.config;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rest.spring.dao.MusicLibraryDao;
import com.rest.spring.domain.Album;

@Component
@Path("/music")
public class MusicLibraryService {

	@Autowired
	private MusicLibraryDao musicLibraryDao;

	@GET
	@Path("/list")
	public Response listAll() {
		List<Album> allAlbums = musicLibraryDao.listAllAlbums();
		// TODO remove this
		allAlbums.add(createDummyAlbum());
		return Response.status(Status.OK).entity(allAlbums.get(0)).build();
	}

	private Album createDummyAlbum() {
		Album dummyAlbum = new Album();
		dummyAlbum.setAlbumName("ABC");
		dummyAlbum.setArtistName("John Doe");
		dummyAlbum.setGenre("Rock");
		return dummyAlbum;
	}
}
