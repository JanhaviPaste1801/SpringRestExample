package com.example.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.main.model.Vehicle;
import com.example.main.repository.VehicleRepository;

@Service
@Transactional
public class VehicleService implements IVehicleService {

	@Autowired
	VehicleRepository repository;

	@Override
	public Vehicle getVehicle(int id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<Vehicle> getAllVehicles() {
		return repository.findAll();
	}

	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
		return repository.save(vehicle);
	}

	@Override
	public List<Vehicle> getAllModels(String company) {
		return repository.findAllByCompany(company);
	}

	@Override
	public Vehicle updateVehicle(Vehicle vehicle) {
		return repository.save(vehicle);
	}

	@Override
	public List<Vehicle> deleteVehicle(int id) {
		repository.deleteById(id);
		return repository.findAll();
	}

}
