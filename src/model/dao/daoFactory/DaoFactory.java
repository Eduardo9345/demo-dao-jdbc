package model.dao.daoFactory;

import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public interface DaoFactory {
	
	public SellerDAO createSellerDAO();
	
	public DepartmentDAO createDepartmentDAO();
}
