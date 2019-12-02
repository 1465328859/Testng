package com.Test.model.DBmodel;

import com.Test.model.DBmodel.AgentTopCommission;

public interface AgentTopCommissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AgentTopCommission record);

    int insertSelective(AgentTopCommission record);

    AgentTopCommission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgentTopCommission record);

    int updateByPrimaryKey(AgentTopCommission record);
}