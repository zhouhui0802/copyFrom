package com.zh.ssm.test;

import com.zh.ssm.bean.Department;
import com.zh.ssm.bean.Empolyee;
import com.zh.ssm.mapper.DepartmentMapper;
import com.zh.ssm.mapper.EmpolyeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.UUID;

@ContextConfiguration(locations = {"classpath:spring.xml"})
@ExtendWith(SpringExtension.class)
public class MapperTest {


    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmpolyeeMapper empolyeeMapper;

    @Autowired
    SqlSession sqlSession;

    @Test
    public void testCRUD(){

        System.out.println(departmentMapper);

        //departmentMapper.insertSelective(new Department(null,"开发部"));
        //departmentMapper.insertSelective(new Department(null,"测试部"));

        //empolyeeMapper.insertSelective(new Empolyee(null,"Jerry","M","@qq.com",1));

        EmpolyeeMapper mapper=sqlSession.getMapper(EmpolyeeMapper.class);
        for(int i=0;i<100;i++){
            String uid=UUID.randomUUID().toString().substring(0,5);
            mapper.insertSelective(new Empolyee(null,uid,"M",uid+"@zh.com",1));
        }
        System.out.println("测试完成");

    }
}
