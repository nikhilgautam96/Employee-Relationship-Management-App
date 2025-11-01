package in.pwskills.nikhil.service;

import java.util.List;
import java.util.Optional;

import in.pwskills.nikhil.entity.Employee;


public interface IEmployeeService {
	
	public Employee saveEmployee(Employee employee);
	public List<Employee>  findAllEmployees();
	public Optional<Employee> findEmployeeById(Integer id);
	public void deleteEmployeeById(Integer id);
}
