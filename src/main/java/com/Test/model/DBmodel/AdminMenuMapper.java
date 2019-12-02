package com.Test.model.DBmodel;

import com.Test.model.DBmodel.AdminMenu;

public interface AdminMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminMenu record);

    int insertSelective(AdminMenu record);

    AdminMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminMenu record);

    int updateByPrimaryKey(AdminMenu record);
}