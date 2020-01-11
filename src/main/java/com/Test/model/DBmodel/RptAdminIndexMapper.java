package com.Test.model.DBmodel;

import com.Test.model.DBmodel.RptAdminIndex;
import com.Test.model.DBmodel.RptAdminIndexExample;
import com.Test.model.DBmodel.RptAdminIndexWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RptAdminIndexMapper {
    long countByExample(RptAdminIndexExample example);

    int deleteByExample(RptAdminIndexExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RptAdminIndexWithBLOBs record);

    int insertSelective(RptAdminIndexWithBLOBs record);

    List<RptAdminIndexWithBLOBs> selectByExampleWithBLOBs(RptAdminIndexExample example);

    List<RptAdminIndex> selectByExample(RptAdminIndexExample example);

    RptAdminIndexWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RptAdminIndexWithBLOBs record, @Param("example") RptAdminIndexExample example);

    int updateByExampleWithBLOBs(@Param("record") RptAdminIndexWithBLOBs record, @Param("example") RptAdminIndexExample example);

    int updateByExample(@Param("record") RptAdminIndex record, @Param("example") RptAdminIndexExample example);

    int updateByPrimaryKeySelective(RptAdminIndexWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RptAdminIndexWithBLOBs record);

    int updateByPrimaryKey(RptAdminIndex record);
}