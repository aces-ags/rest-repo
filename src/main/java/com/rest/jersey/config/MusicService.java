package com.rest.jersey.config;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Component;

@Component
@Path("/music")
public class MusicService {

	@GET
	@Path("/list")
	public Response listAll() {
		return Response.status(Status.OK).entity("Listed Success").build();
	}
}
