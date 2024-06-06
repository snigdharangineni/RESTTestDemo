package com.restApi.RESTDemoTest;

import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAliens()
	{
		System.out.println("get aliens");
		Alien a1 = new Alien();
		a1.setName("Snigdha");
		a1.setPoints(80);
		
		Alien a2 = new Alien();
		a2.setName("Ram");
		a2.setPoints(75);
		
		List<Alien> aliens = Arrays.asList(a1,a2);
		return aliens;
		
	}
}
