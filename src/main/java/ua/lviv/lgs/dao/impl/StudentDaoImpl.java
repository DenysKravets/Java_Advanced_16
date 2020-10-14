package ua.lviv.lgs.dao.impl;

import java.util.ArrayList;
import java.util.List;

import ua.lviv.lgs.dao.StudentDao;
import ua.lviv.lgs.model.Student;

public class StudentDaoImpl implements StudentDao{

	private List<Student> students = new ArrayList<>();
	
	public StudentDaoImpl() {}

	@Override
	public void create(Student student) {
		students.add(student);
	}

	@Override
	public Student read(Integer id) {
		return students.stream().filter(s -> {
			if(s.getId().equals(id)) 
				return true;
			return false;
		}).findAny().get();
	}

	@Override
	public void update(Student student) {
		Student studentInner = read(student.getId());
		studentInner.setName(student.getName());
		studentInner.setAge(student.getAge());
	}

	@Override
	public void delete(Integer id) {
		Student student = read(id);
		students.remove(student);	
	}	
	
}
