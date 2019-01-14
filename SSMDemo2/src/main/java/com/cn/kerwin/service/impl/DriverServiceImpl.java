package com.cn.kerwin.service.impl;

import com.cn.kerwin.dao.DriverMapper;
import com.cn.kerwin.entity.Driver;
import com.cn.kerwin.service.IDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by kerwin on 2017/9/18.
 */
@Service("driverService")
public class DriverServiceImpl implements IDriverService{
    @Autowired
    private DriverMapper driverDao;

    public void addDriver(Driver driver){
        driverDao.insertVehicleTeamUserList(driver.getOrganizationIdList(), driver.getUserId());
    }
    public void addDriver2(Map map){
        driverDao.insertVehicleTeamUserList2(map);
    }
}
