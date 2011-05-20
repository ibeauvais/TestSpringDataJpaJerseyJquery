package com.perso.projectTest1.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseDataSourceConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.ext.h2.H2DataTypeFactory;
import org.dbunit.operation.DatabaseOperation;



public class ImportDbunit {
	
	public static final String DATA_SET_PATH="/dataSet";
	
	private IDatabaseConnection dbUnitCon;
	private IDataSet currentDataSet;
	
	private static final Logger log=Logger.getLogger(ImportDbunit.class);
	
	public ImportDbunit(DataSource dataSource)
	{
		
		try {
			dbUnitCon = new DatabaseDataSourceConnection(dataSource);
			 DatabaseConfig config = dbUnitCon.getConfig();
		        config.setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY,
		                    new H2DataTypeFactory());
		        
		} catch (SQLException e) {
			log.error("error ImportDbunit",e);
		}
	}
	
	
	public  void importData(String dataSetName)
	{
		try {
			currentDataSet = getDataSet(dataSetName);
			
			cleanDatabase();
	           DatabaseOperation.REFRESH.execute(dbUnitCon, currentDataSet);
	           
			
			
		} catch (Exception  e) {
			log.error("error importData",e);
			throw new RuntimeException("Erreur d'importation");
		}
	}


	private  IDataSet getDataSet(String dataSetName) throws FileNotFoundException, DataSetException {
		InputStream input=getClass().getResourceAsStream(DATA_SET_PATH+File.separatorChar+dataSetName);
		if(input==null)
			throw new IllegalArgumentException(DATA_SET_PATH+File.separatorChar+dataSetName+" not found");
		
		return new FlatXmlDataSetBuilder().setColumnSensing(true).build(input);
	}
	
	
	 public void cleanDatabase() throws Exception {
		 DatabaseOperation.DELETE_ALL.execute(dbUnitCon, currentDataSet);
		 }

}
