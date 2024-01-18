package com.xiw.dao;

import com.xiw.pojo.User;

import java.util.List;

public interface IUserDao {

    List<User> findAll() throws Exception;

    User findByCondition(User user);

}
