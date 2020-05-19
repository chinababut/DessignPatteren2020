package com.nani.factory;
import com.nani.dao.CourseExcel;
import com.nani.dao.Dao;

import com.nani.dao.StudentExcel;

public class ExcelFactory {
	private static Dao dao;
	public static Dao getInstanse(String type) {
		
		if(type.equalsIgnoreCase("student"))
		dao = new StudentExcel();
		else if(type.equalsIgnoreCase("course"))
			dao = new CourseExcel();
		else
			throw new IllegalArgumentException("invalid dao type");
		return dao;
		
		
	}

}
