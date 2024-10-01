package com.zh.controller;

import com.zh.dao.EmployeeDao;
import com.zh.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value="/employee",method= RequestMethod.GET)
    public String getAllEmployee(Model model){
        Collection<Employee> allEmployee=employeeDao.getAll();
        model.addAttribute("allEmployee",allEmployee);
        return "employee_list";
    }

}
