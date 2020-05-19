package com.nani.test;

import com.nani.dao.Dao;
import com.nani.factory.DBFactory;
import com.nani.factory.ExcelFactory;

public class AbstractProblemTest {
	public static void main(String[] args) {
		Dao dao1= null;
		Dao dao2 = null;
		dao1 = DBFactory.getInstanse("student");
		dao1.insert();
		dao2 = ExcelFactory.getInstanse("course");
		dao2.insert();
		
		
	}

}
