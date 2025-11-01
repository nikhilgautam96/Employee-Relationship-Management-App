package in.pwskills.nikhil.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pwskills.nikhil.entity.Employee;
import in.pwskills.nikhil.repository.IEmployeeDao;


@Service
public class IEmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao repo;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return repo.findAll();
	}
	
	@Override
	public Optional<Employee> findEmployeeById(Integer id) {
		return repo.findById(id);
	}

	@Override
	public void deleteEmployeeById(Integer id) {
		repo.deleteById(id);
	}

}
