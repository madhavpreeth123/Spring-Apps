package in.madhav;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.madhav.entity.Employee;
import in.madhav.repository.EmployeeRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
				SpringApplication.run(Application.class, args);
		
		EmployeeRepo repo=ctx.getBean(EmployeeRepo.class);
		Employee e1=new Employee(100,"madhav","HR","Male",5000.0);
		Employee e2=new Employee(101,"kesava","Sales","Male",7000.0);
		Employee e3=new Employee(102,"beer","HR","FeMale",4000.0);
		Employee e4=new Employee(103,"gani","Postal","Male",15000.0);
		Employee e5=new Employee(104,"jani","Testing","Male",55000.0);
		Employee e6=new Employee(105,"sreenu","Admin","Male",7000.0);
		Employee e7=new Employee(106,"raj","HR","FeMale",65000.0);
		
		repo.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7));
		System.out.println("Records inserted....");
		
		
		//EmployeeRepo repo=ctx.getBean(EmployeeRepo.class);
//		Sort sort=Sort.by("empName","salary").descending();
//		List<Employee> emps=repo.findAll(sort);
//		emps.forEach(System.out::println);
		
//		int pageNo=2;
//		PageRequest page=PageRequest.of(pageNo-1, 3);
//		
//		Page<Employee> emps=repo.findAll(page);
//		emps.forEach(System.out::println);
		
		/*
		Employee e=new Employee();
		
		e.setDept("HR");
		Example<Employee> emp=Example.of(e);
		List<Employee> emps=repo.findAll(emp);
		emps.forEach(System.out::println);
		*/
		
		
		
		
		
		
	}

}
