package com.nani.factory;
import com.nani.dao.CourseExcel;
import com.nani.dao.Dao;

import com.nani.dao.StudentExcel;

public class ExcelFactory implements DaoFactory {
	private static Dao dao;
	@Override
	public Dao daoCreator(String type) {
		
		
		 
			
			if(type.equalsIgnoreCase("student"))
			dao = new StudentExcel();
			else if(type.equalsIgnoreCase("course"))
				dao = new CourseExcel();
			else
				throw new IllegalArgumentException("invalid dao type");
			return dao;
			
		
	}	
	
	

}
