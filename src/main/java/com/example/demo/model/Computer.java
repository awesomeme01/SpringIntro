package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "computers_1")
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String description;
    private int year;

    public Computer() {
    }

    public Computer(Long id, String brand, String model, String description, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.description = description;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public int getYear() {
        return year;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", com.example.demo.model='" + model + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                '}';
    }
}
