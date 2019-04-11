package com.example.demo.service;

import com.example.demo.model.Computer;
import com.example.demo.repository.ComputerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerServiceImpl implements ComputerService {
    private final ComputerRepository computerRepository;

    public ComputerServiceImpl(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    @Override
    public List<Computer> findAllComputers() {
        return this.computerRepository.findAll();
    }

    @Override
    public Computer findComputerById(Long id) {
        return this.computerRepository.findById(id).get();
    }

    @Override
    public Computer saveComputer(Computer c) {
        return this.computerRepository.save(c);
    }

    @Override
    public void deleteComputer(Long id) {
        this.computerRepository.delete(findComputerById(id));
        System.out.println("Deleted a computer");
    }

//    @Override
//    public Computer updateComputer(Long id, Computer c) {
//        return this.computerRepository.(c);
//    }
}
