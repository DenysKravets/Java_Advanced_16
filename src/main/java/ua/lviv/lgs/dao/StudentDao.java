package ua.lviv.lgs.dao;

import ua.lviv.lgs.model.Student;

public interface StudentDao {
	
	public void create(Student student);
	
	public Student read(Integer id);
	
	public void update(Student student);
	
	public void delete(Integer id);
	
}
