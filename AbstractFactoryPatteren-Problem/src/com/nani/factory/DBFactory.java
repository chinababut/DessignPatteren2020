package com.nani.factory;

import com.nani.dao.CourseDB;
import com.nani.dao.Dao;
import com.nani.dao.StudentDB;

public class DBFactory {
	private static Dao dao;
	public static Dao getInstanse(String type) {
		
		if(type.equalsIgnoreCase("student"))
		dao = new StudentDB();
		else if(type.equalsIgnoreCase("course"))
			dao = new CourseDB();
		else
			throw new IllegalArgumentException("invalid dao type");
		return dao;
		
		
	}

}
