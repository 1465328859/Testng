package com.Test.model.DBmodel;

import com.Test.model.DBmodel.AgentCommission;
import com.Test.model.DBmodel.AgentCommissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgentCommissionMapper {
    long countByExample(AgentCommissionExample example);

    int deleteByExample(AgentCommissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AgentCommission record);

    int insertSelective(AgentCommission record);

    List<AgentCommission> selectByExample(AgentCommissionExample example);

    AgentCommission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AgentCommission record, @Param("example") AgentCommissionExample example);

    int updateByExample(@Param("record") AgentCommission record, @Param("example") AgentCommissionExample example);

    int updateByPrimaryKeySelective(AgentCommission record);

    int updateByPrimaryKey(AgentCommission record);
}