package com.zh.dao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface LogDao {

    @Insert("insert into tbl_log(info,createDate) values(#{info},now())")
    void log(String info);
}
