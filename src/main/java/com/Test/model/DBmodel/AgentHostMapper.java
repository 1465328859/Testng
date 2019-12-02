package com.Test.model.DBmodel;

import com.Test.model.DBmodel.AgentHost;

public interface AgentHostMapper {
    int deleteByPrimaryKey(Integer hostId);

    int insert(AgentHost record);

    int insertSelective(AgentHost record);

    AgentHost selectByPrimaryKey(Integer hostId);

    int updateByPrimaryKeySelective(AgentHost record);

    int updateByPrimaryKey(AgentHost record);
}