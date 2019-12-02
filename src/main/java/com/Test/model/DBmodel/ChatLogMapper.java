package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ChatLog;

public interface ChatLogMapper {
    int deleteByPrimaryKey(Integer logid);

    int insert(ChatLog record);

    int insertSelective(ChatLog record);

    ChatLog selectByPrimaryKey(Integer logid);

    int updateByPrimaryKeySelective(ChatLog record);

    int updateByPrimaryKey(ChatLog record);
}