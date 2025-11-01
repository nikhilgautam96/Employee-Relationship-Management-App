package in.pwskills.nikhil.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.pwskills.nikhil.entity.Employee;
import in.pwskills.nikhil.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	
	@Autowired
	private IEmployeeService service;
	
	@GetMapping("/get-all-employees")
	public ResponseEntity<List<Employee>> getEmployees() {
		return new ResponseEntity<>(service.findAllEmployees(), HttpStatus.OK);
	}
	
	@GetMapping("/get-employee-by-id/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id) {
			Optional<Employee> employee = service.findEmployeeById(id);
			employee.orElseThrow(()-> new IllegalArgumentException("Invalid resource id provided."));
			
			return new ResponseEntity<Employee>(employee.get(), HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<Employee> registerEmployee(@RequestBody Employee employee) {
			return new ResponseEntity<Employee>(service.saveEmployee(employee), 
					HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id, 
			@RequestBody Employee employee) {
		Optional<Employee> employeeFromDb = service.findEmployeeById(id);
		employeeFromDb.orElseThrow(()-> new IllegalArgumentException("Invalid resource id provided."));
		Employee emp = employeeFromDb.get();
		if (employee.getFirstName() != null) emp.setFirstName(employee.getFirstName());
	    if (employee.getLastName() != null) emp.setLastName(employee.getLastName());
	    if (employee.getEmail() != null) emp.setEmail(employee.getEmail());
	    if (employee.getAddress() != null) emp.setAddress(employee.getAddress());
		return new ResponseEntity<Employee>(service.saveEmployee(emp), 
				HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteEmployee(@RequestParam Integer id) {
			Optional<Employee> employee = service.findEmployeeById(id);
			employee.orElseThrow(()-> new IllegalArgumentException("Invalid resource id provided."));
			service.deleteEmployeeById(id);
			
			return new ResponseEntity<String>("employee with given id:: "+id+" deleted",
					HttpStatus.OK);
	}
	
	
}
