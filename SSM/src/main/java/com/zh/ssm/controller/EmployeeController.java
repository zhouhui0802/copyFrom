package com.zh.ssm.controller;

import com.zh.ssm.pojo.Employee;
import com.zh.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 *
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value="/employee",method = RequestMethod.GET)
    public String getAllEmployee(Model model){

        List<Employee> list=employeeService.getAllEmployee();

        model.addAttribute("model",model);

        return "employee_list";
    }
}
