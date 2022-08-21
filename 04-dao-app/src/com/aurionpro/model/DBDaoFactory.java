package com.aurionpro.model;

public class DBDaoFactory implements IDaoAbstractFactory {

	@Override
	public IDao create(String type) {
		if(type.equalsIgnoreCase("emp"))
			return new DBEmpDao();
		if(type.equalsIgnoreCase("dept"))
			return new DBDeptDao();
		return null;
	}

}
