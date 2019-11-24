package com.sda.springdata;

import com.sda.springdata.dao.UserRepository;
import com.sda.springdata.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringDataApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {
        return args -> {
            repository.save(new User("santideva", "sant@gmail.com"));
            repository.save(new User("Magic", "MarieKondo@gmail.com"));
            repository.save(new User("Refactoring", "ExistingCode@gmail.com"));
        };
    }
}

