package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ChatLastreading;
import com.Test.model.DBmodel.ChatLastreadingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChatLastreadingMapper {
    long countByExample(ChatLastreadingExample example);

    int deleteByExample(ChatLastreadingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChatLastreading record);

    int insertSelective(ChatLastreading record);

    List<ChatLastreading> selectByExample(ChatLastreadingExample example);

    ChatLastreading selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChatLastreading record, @Param("example") ChatLastreadingExample example);

    int updateByExample(@Param("record") ChatLastreading record, @Param("example") ChatLastreadingExample example);

    int updateByPrimaryKeySelective(ChatLastreading record);

    int updateByPrimaryKey(ChatLastreading record);
}