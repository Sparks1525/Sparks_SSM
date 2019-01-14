package com.cn.kerwin.entity;


import java.util.List;

public class Driver{
    private Integer userId;

    private List<Integer> organizationIdList;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<Integer> getOrganizationIdList() {
        return organizationIdList;
    }

    public void setOrganizationIdList(List<Integer> organizationIdList) {
        this.organizationIdList = organizationIdList;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "userId=" + userId +
                ", organizationIdList=" + organizationIdList +
                '}';
    }
}