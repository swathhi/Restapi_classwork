package com.example.day5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.day5.models.Book;
public interface BookRepo extends JpaRepository <Book,Integer>
{

}

