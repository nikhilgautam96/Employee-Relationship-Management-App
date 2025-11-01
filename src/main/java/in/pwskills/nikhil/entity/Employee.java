package in.pwskills.nikhil.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer eid;
	
	@Column(name="first_name")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String firstName;
	
	@Column(name="last_name")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String lastName;
	
	@Column(name="email")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String email;
	
	@Column(name="address")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String address;

	public Integer getEid() {
		System.out.println("getEid()");
		return eid;
	}

	public void setEid(Integer eid) {
		System.out.println("setEid()");
		this.eid = eid;
	}

	public String getFirstName() {
		System.out.println("getFirstName()");
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("setFirstName()");
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("getLastNAme()");
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("setLastName()");
		this.lastName = lastName;
	}

	public String getEmail() {
		System.out.println("getEmail()");
		return email;
	}

	public void setEmail(String email) {
		System.out.println("setEmail()");
		this.email = email;
	}

	public String getAddress() {
		System.out.println("getAddress()");
		return address;
	}

	public void setAddress(String address) {
		System.out.println("setAddress()");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + eid + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + "]";
	}
}
