package com.Test.model.DBmodel;

import com.Test.model.DBmodel.AdminWhiteList;

public interface AdminWhiteListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminWhiteList record);

    int insertSelective(AdminWhiteList record);

    AdminWhiteList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminWhiteList record);

    int updateByPrimaryKey(AdminWhiteList record);
}