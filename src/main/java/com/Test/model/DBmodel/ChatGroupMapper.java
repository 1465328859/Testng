package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ChatGroup;
import com.Test.model.DBmodel.ChatGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChatGroupMapper {
    long countByExample(ChatGroupExample example);

    int deleteByExample(ChatGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChatGroup record);

    int insertSelective(ChatGroup record);

    List<ChatGroup> selectByExample(ChatGroupExample example);

    ChatGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChatGroup record, @Param("example") ChatGroupExample example);

    int updateByExample(@Param("record") ChatGroup record, @Param("example") ChatGroupExample example);

    int updateByPrimaryKeySelective(ChatGroup record);

    int updateByPrimaryKey(ChatGroup record);
}