package com.cn.kerwin.service;

import com.cn.kerwin.entity.User;

import java.util.List;

/**
 * Created by kerwin on 2017/9/18.
 */
public interface IUserService {
    User getUserById(int userId);

    void deleteUser(int userId);

    void insert(User user);

    void insertSelective(User user);

    void updateByPrimaryKeySelective(User user);

    void updateByPrimaryKey(User user);

    void insertEmp(List<Integer> id);


}
