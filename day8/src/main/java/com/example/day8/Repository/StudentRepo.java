package com.example.day8.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day8.Model.User;

public interface StudentRepo extends JpaRepository<User, Integer> {

}
