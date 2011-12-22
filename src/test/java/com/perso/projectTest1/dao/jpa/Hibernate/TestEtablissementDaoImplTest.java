package com.perso.projectTest1.dao.jpa.Hibernate;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.perso.projectTest1.model.Etablissement;
import com.perso.projectTest1.repositories.EtablissementDao;
import com.perso.projectTest1.test.ImportDbunit;




@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=true)
@Transactional
@ContextConfiguration({"classpath:spring.xml"})
public class TestEtablissementDaoImplTest {

	@Autowired
	private ImportDbunit importDbUnit;
	
    @Autowired
	private  EtablissementDao etablissementDao;
	
	@Test
	public void testCreate() {
		
		Etablissement etab=new Etablissement();
		etab.setName("toto");
		etab=etablissementDao.save(etab);
		
		assertNotNull(etab);
		assertNotNull(etab.getId());
		
	}
	
	
	@Test
	public void testFindAll() {
		
		importDbUnit.importData("dataSet1.xml");
		List<Etablissement> etablissements=etablissementDao.findAll();
		
		assertNotNull(etablissements);
		assertTrue(etablissements.size()==2);
		
		
	}

}
