package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameReportUser;
import com.Test.model.DBmodel.GameReportUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameReportUserMapper {
    long countByExample(GameReportUserExample example);

    int deleteByExample(GameReportUserExample example);

    int insert(GameReportUser record);

    int insertSelective(GameReportUser record);

    List<GameReportUser> selectByExample(GameReportUserExample example);

    int updateByExampleSelective(@Param("record") GameReportUser record, @Param("example") GameReportUserExample example);

    int updateByExample(@Param("record") GameReportUser record, @Param("example") GameReportUserExample example);
}