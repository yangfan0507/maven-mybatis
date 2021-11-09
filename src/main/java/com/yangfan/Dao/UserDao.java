package com.yangfan.Dao;

import com.yangfan.entity.User;

/**
 * @Author: Cuber
 * @Date: 2021/11/9 19:32
 */
public interface UserDao {
    User selectUserById(Integer id );
}
