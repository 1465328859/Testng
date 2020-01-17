package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameReportSummary;
import com.Test.model.DBmodel.GameReportSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameReportSummaryMapper {
    long countByExample(GameReportSummaryExample example);

    int deleteByExample(GameReportSummaryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameReportSummary record);

    int insertSelective(GameReportSummary record);

    List<GameReportSummary> selectByExample(GameReportSummaryExample example);

    GameReportSummary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameReportSummary record, @Param("example") GameReportSummaryExample example);

    int updateByExample(@Param("record") GameReportSummary record, @Param("example") GameReportSummaryExample example);

    int updateByPrimaryKeySelective(GameReportSummary record);

    int updateByPrimaryKey(GameReportSummary record);
}