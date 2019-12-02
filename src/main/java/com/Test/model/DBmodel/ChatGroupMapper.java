package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ChatGroup;

public interface ChatGroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChatGroup record);

    int insertSelective(ChatGroup record);

    ChatGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChatGroup record);

    int updateByPrimaryKey(ChatGroup record);
}