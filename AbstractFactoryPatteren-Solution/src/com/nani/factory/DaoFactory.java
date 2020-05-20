package com.nani.factory;

import com.nani.dao.Dao;

public interface DaoFactory {
	
	public  Dao daoCreator(String daoType);

}
