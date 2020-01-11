package com.Test.model.DBmodel;

import com.Test.model.DBmodel.AgentHost;
import com.Test.model.DBmodel.AgentHostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgentHostMapper {
    long countByExample(AgentHostExample example);

    int deleteByExample(AgentHostExample example);

    int deleteByPrimaryKey(Integer hostId);

    int insert(AgentHost record);

    int insertSelective(AgentHost record);

    List<AgentHost> selectByExample(AgentHostExample example);

    AgentHost selectByPrimaryKey(Integer hostId);

    int updateByExampleSelective(@Param("record") AgentHost record, @Param("example") AgentHostExample example);

    int updateByExample(@Param("record") AgentHost record, @Param("example") AgentHostExample example);

    int updateByPrimaryKeySelective(AgentHost record);

    int updateByPrimaryKey(AgentHost record);
}