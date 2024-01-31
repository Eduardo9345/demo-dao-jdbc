package application;

import java.util.Iterator;
import java.util.List;

import model.dao.daoFactory.DaoFactory;
import model.dao.daoFactory.DaoFactoryJDBC;
import model.dao.daoFactory.DepartmentDAO;
import model.dao.daoFactory.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
DaoFactory factoryDAO = new DaoFactoryJDBC();
		
		SellerDAO sellerDao = factoryDAO.createSellerDAO();
		DepartmentDAO depDAO = factoryDAO.createDepartmentDAO();
		
		System.out.println("=====TESTE 1 - seller - findById=====");
		Seller sl = sellerDao.findById(5);
		
		System.out.println(sl);
		
		System.out.println("\n=====TESTE 2 - seller - findByDepartment=====");
		
		Department d = new Department(2, null);
		List<Seller> listSl = sellerDao.findByDepartment(d);
		
		for (Seller seller : listSl) {
			System.out.println(seller);
		}
		
		System.out.println("\n=====TESTE 3 - seller - findAll=====");
		
		listSl = sellerDao.findAll();
		
		for (Seller seller : listSl) {
			System.out.println(seller);
		}
	}
}
