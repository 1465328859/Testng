package com.Test.model.DBmodel;

import com.Test.model.DBmodel.RptKill;
import com.Test.model.DBmodel.RptKillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RptKillMapper {
    long countByExample(RptKillExample example);

    int deleteByExample(RptKillExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RptKill record);

    int insertSelective(RptKill record);

    List<RptKill> selectByExample(RptKillExample example);

    RptKill selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RptKill record, @Param("example") RptKillExample example);

    int updateByExample(@Param("record") RptKill record, @Param("example") RptKillExample example);

    int updateByPrimaryKeySelective(RptKill record);

    int updateByPrimaryKey(RptKill record);
}