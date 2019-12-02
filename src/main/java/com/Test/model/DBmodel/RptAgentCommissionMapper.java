package com.Test.model.DBmodel;

import com.Test.model.DBmodel.RptAgentCommission;

public interface RptAgentCommissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RptAgentCommission record);

    int insertSelective(RptAgentCommission record);

    RptAgentCommission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RptAgentCommission record);

    int updateByPrimaryKey(RptAgentCommission record);
}