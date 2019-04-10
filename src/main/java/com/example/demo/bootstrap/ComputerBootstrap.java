package com.example.demo.bootstrap;

import com.example.demo.model.Computer;
import com.example.demo.repository.ComputerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ComputerBootstrap implements CommandLineRunner {
    private final ComputerRepository computerRepository;

    public ComputerBootstrap(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Computer c1 = new Computer("Apple","Macbook Pro 15'","core i5, 16gb RAM, 256gb SSD",2018,1799);
        Computer c2 = new Computer("Apple","Macbook Pro 15'","core i5, 32gb RAM, 512gb SSD",2018,2099);
        Computer c3 = new Computer("Apple","Macbook Pro 15'","core i7, 32gb RAM, 1024gb SSD",2018,3099);
        Computer c4 = new Computer("Apple","Macbook Pro 15'","core i7, 32gb RAM, 2048gb SSD",2018,4099);

        computerRepository.save(c1);
        computerRepository.save(c2);
        computerRepository.save(c3);
        computerRepository.save(c4);

    }
}
