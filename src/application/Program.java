package application;

import java.util.Date;
import java.util.List;

import model.dao.daoFactory.DaoFactory;
import model.dao.daoFactory.DaoFactoryJDBC;
import model.dao.impl.DepartmentDAO;
import model.dao.impl.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		DaoFactory factoryDAO = new DaoFactoryJDBC();
		
		SellerDAO sellerDao = factoryDAO.createSellerDAO();
		DepartmentDAO depDAO = factoryDAO.createDepartmentDAO();
		
//		FINDBYID=============================================================================
		System.out.println("=====TESTE 1 - seller - findById=====");
		Seller sl = sellerDao.findById(5);
		System.out.println(sl);
		
//		FINDBYDEPARTMENT=====================================================================
		System.out.println("\n=====TESTE 2 - seller - findByDepartment=====");
		Department d = new Department(2, null);
		List<Seller> listSl = sellerDao.findByDepartment(d);
		for (Seller seller : listSl) {
			System.out.println(seller);
		}
		
//		FINDALL=============================================================================
		System.out.println("\n=====TESTE 3 - seller - findAll=====");
		listSl = sellerDao.findAll();
		for (Seller seller : listSl) {
			System.out.println(seller);
		}
		
		
//		INSERT=============================================================================
//		System.out.println("\n=====TESTE 4 - seller - insert=====");
//		Seller s1 = new Seller(null, "Paulo", "paulo22@gmail.com", new Date(), 7600.00, new Department(4, null));
//		sellerDao.insert(s1);
//		System.out.println("Done!!!");
		
//		UPDATE=============================================================================
//		System.out.println("\n=====TESTE 5 - seller - update=====");
//		Seller s2 = new Seller(11, "João Paulo", "paulo22@gmail.com", new Date(), 7600.00, new Department(4, null));
//		sellerDao.update(s2);
//		System.out.println("Done!!!");
	}
}
