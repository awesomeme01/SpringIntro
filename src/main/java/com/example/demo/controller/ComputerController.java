package com.example.demo.controller;

import com.example.demo.model.Computer;
import com.example.demo.service.ComputerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ComputerController.URL_COMPUTER)
public class ComputerController {
    public static final String URL_COMPUTER = "/api/v1/computers";
    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }
    @GetMapping
    public List<Computer> getComputers(){
        return this.computerService.findAllComputers();
    }
    @GetMapping("/{id}")
    public Computer getComputerById(@PathVariable Long id){
        return this.computerService.findComputerById(id);
    }
    @PostMapping
    public Computer saveComputer(@RequestBody Computer c){
        return this.computerService.saveComputer(c);
    }

}
