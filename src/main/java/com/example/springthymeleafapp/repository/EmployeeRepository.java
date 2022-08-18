package com.example.springthymeleafapp.repository;

import com.example.springthymeleafapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// provides us with predefined DB methods(CRUD)
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
