package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ChatConfig;
import com.Test.model.DBmodel.ChatConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChatConfigMapper {
    long countByExample(ChatConfigExample example);

    int deleteByExample(ChatConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChatConfig record);

    int insertSelective(ChatConfig record);

    List<ChatConfig> selectByExample(ChatConfigExample example);

    ChatConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChatConfig record, @Param("example") ChatConfigExample example);

    int updateByExample(@Param("record") ChatConfig record, @Param("example") ChatConfigExample example);

    int updateByPrimaryKeySelective(ChatConfig record);

    int updateByPrimaryKey(ChatConfig record);
}