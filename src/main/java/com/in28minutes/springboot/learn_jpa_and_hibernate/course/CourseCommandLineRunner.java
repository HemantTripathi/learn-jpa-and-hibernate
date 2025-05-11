package com.in28minutes.springboot.learn_jpa_and_hibernate.course;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;


    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"Learn Python A", "By Hemant"));
        repository.save(new Course(2,"Learn Java B", "By Hemant T"));
        repository.save(new Course(3,"Learn AWS C", "By Hemant Tripathi"));

        repository.deleteById(1l);

        System.out.println(repository.findById(2l));


    }
}
