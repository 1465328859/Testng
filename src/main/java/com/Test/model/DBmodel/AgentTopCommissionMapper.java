package com.Test.model.DBmodel;

import com.Test.model.DBmodel.AgentTopCommission;
import com.Test.model.DBmodel.AgentTopCommissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgentTopCommissionMapper {
    long countByExample(AgentTopCommissionExample example);

    int deleteByExample(AgentTopCommissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AgentTopCommission record);

    int insertSelective(AgentTopCommission record);

    List<AgentTopCommission> selectByExample(AgentTopCommissionExample example);

    AgentTopCommission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AgentTopCommission record, @Param("example") AgentTopCommissionExample example);

    int updateByExample(@Param("record") AgentTopCommission record, @Param("example") AgentTopCommissionExample example);

    int updateByPrimaryKeySelective(AgentTopCommission record);

    int updateByPrimaryKey(AgentTopCommission record);
}