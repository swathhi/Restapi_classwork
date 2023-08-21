package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.day4.Petrolbunk;
import com.example.demo.service.fuelservice;

@RestController
public class fuelcontroller {
	@Autowired
	fuelservice fser;
	@PostMapping("/saveFuel")
	public Petrolbunk saveFuelStation(@RequestBody Petrolbunk pb)
	{
		return fser.saveDetails(pb);
	}
	@GetMapping("/getFuel")
	public List<Petrolbunk> getFuelStationDe ()
	{
		return fser.getDetails();
	}

}
