package com.Test.model.DBmodel;

import com.Test.model.DBmodel.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface UsersMapper extends BaseMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

}