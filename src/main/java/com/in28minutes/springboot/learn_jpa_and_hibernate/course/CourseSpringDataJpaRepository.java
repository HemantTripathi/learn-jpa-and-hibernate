package com.in28minutes.springboot.learn_jpa_and_hibernate.course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
