package com.cn.kerwin.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by kerwin on 2017/9/18.
 */
public interface DriverMapper {
    void insertVehicleTeamUserList(@Param("organizationIdList") List<Integer> organizationIdList, @Param("userId") Integer userId);
    void insertVehicleTeamUserList2(Map<String, Object> map);

}
