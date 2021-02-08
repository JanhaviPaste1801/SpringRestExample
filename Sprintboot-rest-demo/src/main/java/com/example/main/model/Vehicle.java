package com.example.main.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "vehicle_master")
public class Vehicle implements Serializable{

	@Id
	@GeneratedValue
	@Column(name = "vehicle_id")
	private Integer id;
	@Column(name = "vehicle_model")
	@NotEmpty(message = "Model should not empty")
	@Size(min = 4, message = "min 4 chars required")
	private String model;

	@Column(name = "cost")
	@NotNull(message = "Cost should not be empty")
	private Double cost;

	@NotEmpty(message = "Company name should not empty")
	@Size(min = 4, message = "min 4 chars required")
	@Column(name = "company_name")
	private String company;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(Integer id, String model, Double cost, String company) {
		super();
		this.id = id;
		this.model = model;
		this.cost = cost;
		this.company = company;
	}

	public Vehicle(String model, Double cost, String company) {
		super();
		this.model = model;
		this.cost = cost;
		this.company = company;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", model=" + model + ", cost=" + cost + ", company=" + company + "]";
	}

}
