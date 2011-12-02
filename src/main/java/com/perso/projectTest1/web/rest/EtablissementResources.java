package com.perso.projectTest1.web.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.perso.projectTest1.model.Etablissement;
import com.perso.projectTest1.repositories.EtablissementDao;


@Component
@Path("/etablissement")
public class EtablissementResources {

	@Autowired
	private EtablissementDao etablissementDao;
	
	
	@GET
	@Path("/{id}")
	public Response get(@PathParam("id") long id) {
		
		Etablissement etab= etablissementDao.findOne(id);
		
		return Response.ok(etab).build();
	}
}
