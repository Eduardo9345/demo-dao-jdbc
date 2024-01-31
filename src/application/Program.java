package application;

import java.util.Date;

import model.dao.daoFactory.DaoFactory;
import model.dao.daoFactory.DaoFactoryJDBC;
import model.dao.daoFactory.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
DaoFactory factoryDAO = new DaoFactoryJDBC();
		
		SellerDAO sellerDao = factoryDAO.createSellerDAO();
		
		Seller sl = sellerDao.findById(2);
		
		System.out.println(sl);
	}
}
