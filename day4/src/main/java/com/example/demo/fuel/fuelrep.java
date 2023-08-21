package com.example.demo.fuel;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.day4.Petrolbunk;

public interface fuelrep extends JpaRepository<Petrolbunk,Integer>
{

}
