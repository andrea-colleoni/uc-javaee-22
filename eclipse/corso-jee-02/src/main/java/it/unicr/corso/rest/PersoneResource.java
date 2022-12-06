package it.unicr.corso.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import it.unicr.corso.Persona;

@Path("/persone")
public class PersoneResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response elencoPersone() {
		return Response
				// .ok(new ArrayList<Persona>()) // body della response
				.ok() // http 200: success
				.entity(new ArrayList<Persona>())
				.build();
	}
	
	@GET
	@Path("/{email}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response personaPerEmail(@PathParam("email") String email) {
		return Response
				.status(Status.NOT_FOUND)
				.build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response inserisciPersona(Persona persona) {
		return Response
				.status(Status.CREATED)
				.entity(persona)  // body della response
				.build();
	}
}
