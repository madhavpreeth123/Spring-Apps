package in.madhav.service;

import java.util.Arrays;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.madhav.binding.Student;
import in.madhav.entity.StudentEntity;
import in.madhav.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;
	
	public boolean saveStudent(Student sob) {
		StudentEntity entity=new StudentEntity();
		BeanUtils.copyProperties(sob, entity); //copying one object data into another object
		//source class variables data types should same
		
		//coverting arrys data into string 
		entity.setTimings(Arrays.toString(sob.getTimings()));
		
		repo.save(entity);
		return true;
	}
	
	
	
	
	public List<String> getCourses(){
		
		return Arrays.asList("Java","Python","AWS","Devops");
	}
	
	public List<String> getTimings(){
		
		return Arrays.asList("Morning","Afternoon","Evening");
	}
}
