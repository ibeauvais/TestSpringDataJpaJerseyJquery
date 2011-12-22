package com.perso.projectTest1.web.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.perso.projectTest1.model.Etablissement;
import com.perso.projectTest1.repositories.EtablissementDao;


@Component
@Path("/etablissement")
public class EtablissementResources {
	
	//private static final Logger log=Logger.getLogger(EtablissementResources.class);

	@Autowired
	private EtablissementDao etablissementDao;
	
	
	@GET
	@Path("/{id}")
	public Response get(@PathParam("id") long id) {
		
		Etablissement etab= etablissementDao.findOne(id);
		
		return Response.ok(etab).build();
	}
	
	@POST
	public Response save(Etablissement estab) {
		
		Etablissement etab= etablissementDao.saveAndFlush(estab);
		
		return Response.ok(etab).build();
	}
	
	

	@GET
	public Response getAll() {
		
		List<Etablissement> etabs= etablissementDao.findAll();
		  GenericEntity<List<Etablissement>> entity = new GenericEntity<List<Etablissement>>(etabs) {};
		return Response.ok(entity).build();
	}

}
