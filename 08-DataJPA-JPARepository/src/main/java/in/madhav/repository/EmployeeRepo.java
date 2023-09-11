package in.madhav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.madhav.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
//	@Query(value="update employee set emp_name=madhavpreeth")
//	public boolean updateName(String name);

}
