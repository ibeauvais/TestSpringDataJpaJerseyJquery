package com.perso.projectTest1.dao.jpa.Hibernate;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.perso.projectTest1.dao.EtablissementDao;

import com.perso.projectTest1.model.Etablissement;




@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager="txManager", defaultRollback=true)
@Transactional
@ContextConfiguration({"classpath:contextJpaHibernate.xml"})
public class TestEtablissementDaoImplTest {

	private static Logger log=LoggerFactory.getLogger(TestEtablissementDaoImplTest.class);
    @Resource
	private  EtablissementDao etablissementDao;
	
	@Test
	public void testCreate() {
		
		Etablissement etab=new Etablissement();
		etab.setName("toto");
		etablissementDao.create(etab);
		
	}

}
