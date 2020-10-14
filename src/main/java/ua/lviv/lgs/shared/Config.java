package ua.lviv.lgs.shared;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ua.lviv.lgs.dao.impl.StudentDaoImpl;
import ua.lviv.lgs.model.Student;

@Configuration
public class Config {
	
	@Bean(name="StudentDaoImpl")
	public StudentDaoImpl getStudentDaoImpl() {
		StudentDaoImpl sdi = new StudentDaoImpl();
		
		sdi.create(new Student(1, "Mark", 31));
		sdi.create(new Student(2, "John", 14));
		sdi.create(new Student(3, "Ivan", 56));
		sdi.create(new Student(4, "Wolgan", 24));
		
		return sdi;
	}
	
}
