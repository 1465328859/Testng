package com.Test.model.DBmodel;

import com.Test.model.DBmodel.AgentTransfer;

public interface AgentTransferMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AgentTransfer record);

    int insertSelective(AgentTransfer record);

    AgentTransfer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgentTransfer record);

    int updateByPrimaryKey(AgentTransfer record);
}