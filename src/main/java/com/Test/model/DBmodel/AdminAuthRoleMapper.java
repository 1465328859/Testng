package com.Test.model.DBmodel;

import com.Test.model.DBmodel.AdminAuthRole;

public interface AdminAuthRoleMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(AdminAuthRole record);

    int insertSelective(AdminAuthRole record);

    AdminAuthRole selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(AdminAuthRole record);

    int updateByPrimaryKey(AdminAuthRole record);
}