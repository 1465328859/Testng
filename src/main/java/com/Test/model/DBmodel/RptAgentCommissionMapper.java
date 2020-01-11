package com.Test.model.DBmodel;

import com.Test.model.DBmodel.RptAgentCommission;
import com.Test.model.DBmodel.RptAgentCommissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RptAgentCommissionMapper {
    long countByExample(RptAgentCommissionExample example);

    int deleteByExample(RptAgentCommissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RptAgentCommission record);

    int insertSelective(RptAgentCommission record);

    List<RptAgentCommission> selectByExample(RptAgentCommissionExample example);

    RptAgentCommission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RptAgentCommission record, @Param("example") RptAgentCommissionExample example);

    int updateByExample(@Param("record") RptAgentCommission record, @Param("example") RptAgentCommissionExample example);

    int updateByPrimaryKeySelective(RptAgentCommission record);

    int updateByPrimaryKey(RptAgentCommission record);
}