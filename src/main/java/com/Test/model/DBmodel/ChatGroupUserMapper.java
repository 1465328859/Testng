package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ChatGroupUser;

public interface ChatGroupUserMapper {
    int insert(ChatGroupUser record);

    int insertSelective(ChatGroupUser record);
}