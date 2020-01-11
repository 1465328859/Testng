package com.Test.model.DBmodel;

import com.Test.model.DBmodel.AgentTransfer;
import com.Test.model.DBmodel.AgentTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgentTransferMapper {
    long countByExample(AgentTransferExample example);

    int deleteByExample(AgentTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AgentTransfer record);

    int insertSelective(AgentTransfer record);

    List<AgentTransfer> selectByExample(AgentTransferExample example);

    AgentTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AgentTransfer record, @Param("example") AgentTransferExample example);

    int updateByExample(@Param("record") AgentTransfer record, @Param("example") AgentTransferExample example);

    int updateByPrimaryKeySelective(AgentTransfer record);

    int updateByPrimaryKey(AgentTransfer record);
}