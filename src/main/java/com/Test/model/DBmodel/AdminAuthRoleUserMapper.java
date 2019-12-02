package com.Test.model.DBmodel;

import com.Test.model.DBmodel.AdminAuthRoleUser;

public interface AdminAuthRoleUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminAuthRoleUser record);

    int insertSelective(AdminAuthRoleUser record);

    AdminAuthRoleUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminAuthRoleUser record);

    int updateByPrimaryKey(AdminAuthRoleUser record);
}