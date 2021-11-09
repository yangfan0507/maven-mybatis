package com.yangfan;

import com.yangfan.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * @Author: Cuber
 * @Date: 2021/11/9 20:09
 */
public class MyTest {
    @Test
    public void testSelectUserById() throws Exception{
        //调用mybatis的某个对象执行mapper（dao.xml）文件中的sql语句
        String resource = "mybatis-config.xml";
        //读取resource文件（用mybatis中的Resource类读取）
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //用SqlSessionFactoryBuilder的build方法来构建sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //用SqlSessionFactory对象来获取SqlSession对象
        SqlSession sqlSession =sqlSessionFactory.openSession();
        //指定要执行的sql语句id
        //sql的  id=   namespace(在UserDao.xml)+"."+select/update....等等标签的id值(在map的子标签中)
//      eg:  com.yangfan.Dao.UserDao+“.”+selectUserById
        String sqlId="com.yangfan.Dao.UserDao"+"."+"selectUserById";
        String sqlId2="com.yangfan.Dao.UserDao"+"."+"selectUserById###";//        占位符模式

        //用sqlsession对象的selectOne方法执行sql语句(根据sqlId)并且接收返回的对象

        User user1=sqlSession.selectOne(sqlId);
        User user2=sqlSession.selectOne(sqlId2,6);//6是id，填充占位符
        System.out.println("查询user1的数据："+user1);
        System.out.println("查询user2的数据："+user2);
        user2=sqlSession.selectOne(sqlId2,2);//2是id，填充占位符,改了一遍之后在输出
        System.out.println("查询user2的数据："+user2);
        sqlSession.close();
    }
}
