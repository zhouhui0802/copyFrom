package com.zh.main;

import com.zh.domain.Account;
import jdk.internal.util.xml.impl.Input;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import com.zh.dao.AccountDao;
public class App {

    public static void main(String args[]) throws Exception{

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();

        InputStream inputStream= Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(inputStream);

        SqlSession sqlSession=sqlSessionFactory.openSession();

        AccountDao accountDao=sqlSession.getMapper(AccountDao.class);

        Account account=accountDao.findById(1);

        System.out.println(account);

        sqlSession.close();
    }
}
