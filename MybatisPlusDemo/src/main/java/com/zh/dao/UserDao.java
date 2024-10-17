package com.zh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zh.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
