package com.zh.ssm.service;

import com.zh.ssm.bean.Empolyee;
import com.zh.ssm.mapper.EmpolyeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmpolyeeMapper employeeMapper;

    public List<Empolyee> getAll(){
        return employeeMapper.selectByExampleWithDept(null);
    }
}
