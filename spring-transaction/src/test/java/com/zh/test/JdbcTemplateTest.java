package com.zh.test;

import com.zh.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-annotation.xml")
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testInsert(){
        String sql="insert into t_user values(null,?,?,?,?,?)";
        jdbcTemplate.update(sql,"root","123",23,"女","123456");
    }

    @Test
    public void testGetUserById(){
        String sql="select * from t_user where id=?";
        User user=jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),1);
        System.out.println(user);
    }

    @Test
    public void testGetAllUser(){
        String sql="select * from t_user";
        List<User> list=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(User.class));
        list.forEach(System.out::println);
    }

    @Test
    public void testGetCount(){
        String sql="select count(*) from t_user";
        Integer count=jdbcTemplate.queryForObject(sql,Integer.class);
        System.out.println(count);
    }
}
