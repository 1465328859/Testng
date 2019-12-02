package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ChatConfig;

public interface ChatConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChatConfig record);

    int insertSelective(ChatConfig record);

    ChatConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChatConfig record);

    int updateByPrimaryKey(ChatConfig record);
}