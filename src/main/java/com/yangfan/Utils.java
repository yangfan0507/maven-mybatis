package com.yangfan;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
/**
 * @Author: Cuber
 * @Date: 2021/11/9 18:04
 */
public class Utils {
   private static String resource = "mybatis-config.xml";
   private static InputStream inputStream;
   private static SqlSessionFactory sqlSessionFactory;
    public Utils(){
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }

}
