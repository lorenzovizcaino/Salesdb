package modelo;
// Generated 22 mar 2023 10:52:22 by Hibernate Tools 4.3.6.Final

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

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
 * Customers generated by hbm2java
 */
@Entity
@Table(name = "Customers", catalog = "salesdb")
public class Customers implements java.io.Serializable {

	private Integer customerId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private Set<Sales> saleses = new HashSet<Sales>(0);

	public Customers() {
	}

	public Customers(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Customers(String firstName, String middleInitial, String lastName, Set<Sales> saleses) {
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.saleses = saleses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "CustomerID", unique = true, nullable = false)
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customers")
	public Set<Sales> getSaleses() {
		return this.saleses;
	}

	public void setSaleses(Set<Sales> saleses) {
		this.saleses = saleses;
	}

}
