package com.example.main.service;

import java.util.List;

import com.example.main.model.Vehicle;

public interface IVehicleService {

	Vehicle getVehicle(int id);
	
	List<Vehicle> getAllVehicles();

	Vehicle addVehicle(Vehicle vehicle);

	List<Vehicle> getAllModels(String company);

	Vehicle updateVehicle(Vehicle vehicle);

	List<Vehicle> deleteVehicle(int id);

}
