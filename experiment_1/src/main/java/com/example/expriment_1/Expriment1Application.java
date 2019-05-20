package com.example.expriment_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.expriment_1.repository.*;

@SpringBootApplication
public class Expriment1Application {
    private UserRepository userRepository;
    public static void main(String[] args) {

        SpringApplication.run(Expriment1Application.class, args);

    }

}
