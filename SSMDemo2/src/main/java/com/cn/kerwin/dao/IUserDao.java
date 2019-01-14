package com.cn.kerwin.dao;

import com.cn.kerwin.entity.User;

import java.util.List;

/**
 * Created by kerwin on 2017/9/18.
 */
public interface IUserDao {
    int deleteByPrimaryKey(Integer id);


    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int insertEmp(List<Integer> id);

}
