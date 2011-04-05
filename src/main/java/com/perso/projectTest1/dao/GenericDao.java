package com.perso.projectTest1.dao;

import com.perso.projectTest1.model.IModel;

public interface GenericDao<L extends IModel> {
	
	
	
	L create(L object);

}
