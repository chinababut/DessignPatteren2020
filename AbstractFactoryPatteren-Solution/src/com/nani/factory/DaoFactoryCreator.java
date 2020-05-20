package com.nani.factory;

public class DaoFactoryCreator  {
	private static DaoFactory dao;
	
	public static DaoFactory buildDaoFactory(String daoType) {
		if(daoType.equalsIgnoreCase("db"))
			dao = new DBFactory();
		else if(daoType.equalsIgnoreCase("excel"))
			dao = new ExcelFactory();
		else 
			new IllegalArgumentException("invalind db name");
		return dao;
	}

}
