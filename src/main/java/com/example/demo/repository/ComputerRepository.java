package com.example.demo.repository;
import com.example.demo.model.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository
        extends JpaRepository<Computer, Long> {

}
