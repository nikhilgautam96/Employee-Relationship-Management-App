package in.example.nikhil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.example.nikhil.entity.Employee;


@Repository
public interface IEmployeeDao extends JpaRepository<Employee, Integer> {

}
