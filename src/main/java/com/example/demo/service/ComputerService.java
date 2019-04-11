package com.example.demo.service;

import com.example.demo.model.Computer;

import java.util.List;

public interface ComputerService {
    List<Computer> findAllComputers();
    Computer findComputerById(Long id);
    Computer saveComputer(Computer c);
    void deleteComputer(Long id);
//    Computer updateComputer(Long id, Computer c);
}
