package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ChatLog;
import com.Test.model.DBmodel.ChatLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChatLogMapper {
    long countByExample(ChatLogExample example);

    int deleteByExample(ChatLogExample example);

    int deleteByPrimaryKey(Integer logid);

    int insert(ChatLog record);

    int insertSelective(ChatLog record);

    List<ChatLog> selectByExample(ChatLogExample example);

    ChatLog selectByPrimaryKey(Integer logid);

    int updateByExampleSelective(@Param("record") ChatLog record, @Param("example") ChatLogExample example);

    int updateByExample(@Param("record") ChatLog record, @Param("example") ChatLogExample example);

    int updateByPrimaryKeySelective(ChatLog record);

    int updateByPrimaryKey(ChatLog record);
}