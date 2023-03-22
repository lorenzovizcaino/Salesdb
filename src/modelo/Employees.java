package modelo;
// Generated 22 mar 2023 10:52:22 by Hibernate Tools 4.3.6.Final

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Employees generated by hbm2java
 */
@Entity
@Table(name = "Employees", catalog = "salesdb")
public class Employees implements java.io.Serializable {

	private Integer employeeId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private Set<Sales> saleses = new HashSet<Sales>(0);

	public Employees() {
	}

	public Employees(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Employees(String firstName, String middleInitial, String lastName, Set<Sales> saleses) {
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.saleses = saleses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "EmployeeID", unique = true, nullable = false)
	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "FirstName", nullable = false)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "MiddleInitial")
	public String getMiddleInitial() {
		return this.middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	@Column(name = "LastName", nullable = false)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employees")
	public Set<Sales> getSaleses() {
		return this.saleses;
	}

	public void setSaleses(Set<Sales> saleses) {
		this.saleses = saleses;
	}

}
