package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ChatLastreading;

public interface ChatLastreadingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChatLastreading record);

    int insertSelective(ChatLastreading record);

    ChatLastreading selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChatLastreading record);

    int updateByPrimaryKey(ChatLastreading record);
}