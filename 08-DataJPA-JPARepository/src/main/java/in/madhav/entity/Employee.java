package in.madhav.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Employee {
	
	@Id
	private Integer empId;
	private String empName;
	private String dept;
	private String gender;
	private Double salary;

}
