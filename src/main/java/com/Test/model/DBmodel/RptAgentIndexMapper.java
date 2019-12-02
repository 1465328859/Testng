package com.Test.model.DBmodel;

import com.Test.model.DBmodel.RptAgentIndex;
import com.Test.model.DBmodel.RptAgentIndexWithBLOBs;

public interface RptAgentIndexMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RptAgentIndexWithBLOBs record);

    int insertSelective(RptAgentIndexWithBLOBs record);

    RptAgentIndexWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RptAgentIndexWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RptAgentIndexWithBLOBs record);

    int updateByPrimaryKey(RptAgentIndex record);
}