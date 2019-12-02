package com.Test.model.DBmodel;

import com.Test.model.DBmodel.UsersPush;
import com.Test.model.DBmodel.UsersPushWithBLOBs;

public interface UsersPushMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UsersPushWithBLOBs record);

    int insertSelective(UsersPushWithBLOBs record);

    UsersPushWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UsersPushWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UsersPushWithBLOBs record);

    int updateByPrimaryKey(UsersPush record);
}