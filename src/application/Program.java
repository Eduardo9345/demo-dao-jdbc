package application;

import java.util.Date;

import model.dao.daoFactory.DaoFactory;
import model.dao.daoFactory.DaoFactoryJDBC;
import model.dao.daoFactory.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);
		
		DaoFactory factoryDAO = new DaoFactoryJDBC();
		
		SellerDAO sellerDao = factoryDAO.createSellerDAO();
		
		System.out.println(obj);
		System.out.println(seller);
	}
}
