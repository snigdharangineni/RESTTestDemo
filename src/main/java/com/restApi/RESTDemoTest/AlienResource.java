package com.restApi.RESTDemoTest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Alien getAlien()
	{
		System.out.println("get aliens");
		Alien a1 = new Alien();
		a1.setName("Snigdha");
		a1.setPoints(80);
		return a1;
		
	}
}
