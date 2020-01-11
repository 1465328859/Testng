package com.Test.model.DBmodel;

import com.Test.model.DBmodel.RptAgentIndex;
import com.Test.model.DBmodel.RptAgentIndexExample;
import com.Test.model.DBmodel.RptAgentIndexWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RptAgentIndexMapper {
    long countByExample(RptAgentIndexExample example);

    int deleteByExample(RptAgentIndexExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RptAgentIndexWithBLOBs record);

    int insertSelective(RptAgentIndexWithBLOBs record);

    List<RptAgentIndexWithBLOBs> selectByExampleWithBLOBs(RptAgentIndexExample example);

    List<RptAgentIndex> selectByExample(RptAgentIndexExample example);

    RptAgentIndexWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RptAgentIndexWithBLOBs record, @Param("example") RptAgentIndexExample example);

    int updateByExampleWithBLOBs(@Param("record") RptAgentIndexWithBLOBs record, @Param("example") RptAgentIndexExample example);

    int updateByExample(@Param("record") RptAgentIndex record, @Param("example") RptAgentIndexExample example);

    int updateByPrimaryKeySelective(RptAgentIndexWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RptAgentIndexWithBLOBs record);

    int updateByPrimaryKey(RptAgentIndex record);
}