package com.Test.model.DBmodel;

import com.Test.model.DBmodel.AdminUser;

public interface AdminUserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(AdminUser record);

    int insertSelective(AdminUser record);

    AdminUser selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(AdminUser record);

    int updateByPrimaryKey(AdminUser record);
}