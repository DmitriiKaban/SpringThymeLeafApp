package com.example.springthymeleafapp.controller;

import com.example.springthymeleafapp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.springthymeleafapp.repository.EmployeeRepository;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository eRepo; // DB methods

    @GetMapping("/")//({"/showEmployees", "/", "/list"})
    public ModelAndView showEmployees(){ // Handler method
        ModelAndView mav = new ModelAndView("list-employees");
        List<Employee> list = eRepo.findAll();
        mav.addObject("employees", list); // transmit list of employees

        return mav;
    }
}
