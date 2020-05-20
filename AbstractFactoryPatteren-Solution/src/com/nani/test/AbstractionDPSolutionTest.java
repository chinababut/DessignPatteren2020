package com.nani.test;

import com.nani.dao.Dao;
import com.nani.factory.DBFactory;
import com.nani.factory.DaoFactory;
import com.nani.factory.DaoFactoryCreator;

public class AbstractionDPSolutionTest {
	public static void main(String[] args) {
		Dao dao1 = null, dao2 = null;

		DaoFactory factory = DaoFactoryCreator.buildDaoFactory("excel"); 
		//DBFactory factory = new DBFactory();
		dao1 = factory.daoCreator("student");
		dao2 = factory.daoCreator("course");
		dao1.insert();
		dao2.insert();

	}

}
