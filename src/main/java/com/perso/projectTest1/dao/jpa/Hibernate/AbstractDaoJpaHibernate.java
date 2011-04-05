package com.perso.projectTest1.dao.jpa.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.perso.projectTest1.dao.GenericDao;
import com.perso.projectTest1.model.IModel;

public class AbstractDaoJpaHibernate<L extends IModel>  implements GenericDao<L>{

	
	@PersistenceContext(unitName="daoUnit") 
	protected EntityManager entityManager; 
	
	
	public L create(L object)
	{
		entityManager.persist(object);
		return object;
	}
	
	
	
}
