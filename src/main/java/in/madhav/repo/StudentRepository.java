package in.madhav.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.madhav.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
