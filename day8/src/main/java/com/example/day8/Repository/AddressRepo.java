package com.example.day8.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day8.Model.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}