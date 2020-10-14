package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.lgs.dao.StudentDao;
import ua.lviv.lgs.dao.impl.StudentDaoImpl;
import ua.lviv.lgs.model.Student;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Main.class, args);
		
		StudentDao sti = (StudentDaoImpl) ctx.getBean("StudentDaoImpl");

		System.out.println(sti.read(1));
		
		sti.update(new Student(1, "Morkva", 32));
		System.out.println(sti.read(1));
		
		sti.create(new Student(5, "Petro", 24));
		System.out.println(sti.read(5));
		
		sti.delete(5);
		System.out.println(sti.read(5));
		
	}

}
