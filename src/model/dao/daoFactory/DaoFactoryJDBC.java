package model.dao.daoFactory;

import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactoryJDBC implements DaoFactory{

	@Override
	public SellerDAO createSellerDAO() {
		// TODO Auto-generated method stub
		return new SellerDaoJDBC();
	}

	@Override
	public DepartmentDAO createDepartmentDAO() {
		return new DepartmentDaoJDBC();
	}

}
