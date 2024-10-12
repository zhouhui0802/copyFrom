package com.zh.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zh.ssm.mapper.EmployeeMapper;
import com.zh.ssm.pojo.Employee;
import com.zh.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;


    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {

        //开启分页功能
        PageHelper.startPage(pageNum,4);

        List<Employee> list=employeeMapper.getAllEmployee();

        PageInfo<Employee> page=new PageInfo<>(list,3);

        return page;
    }
}
