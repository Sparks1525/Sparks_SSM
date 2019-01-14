package com.cn.kerwin.service.impl;

import com.cn.kerwin.dao.IUserDao;
import com.cn.kerwin.entity.User;
import com.cn.kerwin.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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

}
