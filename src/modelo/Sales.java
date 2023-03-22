package modelo;
// Generated 22 mar 2023 10:52:22 by Hibernate Tools 4.3.6.Final

import javax.persistence.*;

import modelo.Customers;

import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "Sales", catalog = "salesdb")
public class Sales implements java.io.Serializable {

	private Integer salesId;
	private Customers customers;
	private Employees employees;
	private Products products;
	private int quantity;

	public Sales() {
	}

	public Sales(Customers customers, Employees employees, Products products, int quantity) {
		this.customers = customers;
		this.employees = employees;
		this.products = products;
		this.quantity = quantity;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "SalesID", unique = true, nullable = false)
	public Integer getSalesId() {
		return this.salesId;
	}

	public void setSalesId(Integer salesId) {
		this.salesId = salesId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CustomerID", nullable = false)
	public Customers getCustomers() {
		return this.customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SalesPersonID", nullable = false)
	public Employees getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ProductID", nullable = false)
	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	@Column(name = "Quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

