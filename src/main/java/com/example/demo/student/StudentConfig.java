package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return  args -> {
            Student mariam = new Student(
                    1L,
                    "Mariam",
                   "mariamjoel@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 14)

            );
            Student alex = new Student(
                    "Alex",
                    "alexl@gmail.com",
                    LocalDate.of(2002, Month.JANUARY, 14)
            );
            repository.saveAll( //saves a list of students
                    List.of(mariam, alex)
            );
        };
    }
}
