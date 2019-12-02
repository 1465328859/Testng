package com.Test.model.DBmodel;

import com.Test.model.DBmodel.AdminAuthAccess;

public interface AdminAuthAccessMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminAuthAccess record);

    int insertSelective(AdminAuthAccess record);

    AdminAuthAccess selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminAuthAccess record);

    int updateByPrimaryKey(AdminAuthAccess record);
}