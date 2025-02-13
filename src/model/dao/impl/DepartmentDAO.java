package model.dao.impl;

import java.util.List;

import model.entities.Department;

public interface DepartmentDAO {
	
	public void insert(Department obj);
	
	public void update(Department obj);
	
	public void deleteById(Integer id);
	
	public Department findById(Integer id);
	
	public List<Department> findAll();
}
