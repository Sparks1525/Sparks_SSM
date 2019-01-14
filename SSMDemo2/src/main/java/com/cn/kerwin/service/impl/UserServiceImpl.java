package com.cn.kerwin.service.impl;

import com.cn.kerwin.dao.IUserDao;
import com.cn.kerwin.entity.User;
import com.cn.kerwin.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kerwin on 2017/9/18.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    @Override
    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }

    public void deleteUser(int userId){
        this.userDao.deleteByPrimaryKey(userId);
    }

    public void insert(User user){
        this.userDao.insert(user);
    }


    public void insertEmp(List<Integer> id) {this.userDao.insertEmp(id);}

    public void insertSelective(User user){
        this.userDao.insertSelective(user);
    }

    public void updateByPrimaryKeySelective(User user){
        this.userDao.updateByPrimaryKeySelective(user);
    }
    public void updateByPrimaryKey(User user){
        this.userDao.updateByPrimaryKey(user);
    }

}
