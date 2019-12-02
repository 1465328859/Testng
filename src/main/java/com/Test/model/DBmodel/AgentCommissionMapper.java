package com.Test.model.DBmodel;

import com.Test.model.DBmodel.AgentCommission;

public interface AgentCommissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AgentCommission record);

    int insertSelective(AgentCommission record);

    AgentCommission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgentCommission record);

    int updateByPrimaryKey(AgentCommission record);
}