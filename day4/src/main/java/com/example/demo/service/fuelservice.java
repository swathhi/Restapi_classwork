package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.day4.Petrolbunk;
import com.example.demo.fuel.fuelrep;

@Service
public class fuelservice {
	@Autowired
	public fuelrep frepo;
	public Petrolbunk saveDetails(Petrolbunk p)
	{
		return frepo.save(p);
	}
	public List<Petrolbunk> getDetails()
	{
		return frepo.findAll();
		
	}

}
