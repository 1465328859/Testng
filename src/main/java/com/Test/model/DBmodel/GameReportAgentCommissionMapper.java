package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameReportAgentCommission;
import com.Test.model.DBmodel.GameReportAgentCommissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameReportAgentCommissionMapper {
    long countByExample(GameReportAgentCommissionExample example);

    int deleteByExample(GameReportAgentCommissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameReportAgentCommission record);

    int insertSelective(GameReportAgentCommission record);

    List<GameReportAgentCommission> selectByExample(GameReportAgentCommissionExample example);

    GameReportAgentCommission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameReportAgentCommission record, @Param("example") GameReportAgentCommissionExample example);

    int updateByExample(@Param("record") GameReportAgentCommission record, @Param("example") GameReportAgentCommissionExample example);

    int updateByPrimaryKeySelective(GameReportAgentCommission record);

    int updateByPrimaryKey(GameReportAgentCommission record);
}