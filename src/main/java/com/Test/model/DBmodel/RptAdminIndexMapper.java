package com.Test.model.DBmodel;

import com.Test.model.DBmodel.RptAdminIndex;
import com.Test.model.DBmodel.RptAdminIndexWithBLOBs;

public interface RptAdminIndexMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RptAdminIndexWithBLOBs record);

    int insertSelective(RptAdminIndexWithBLOBs record);

    RptAdminIndexWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RptAdminIndexWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RptAdminIndexWithBLOBs record);

    int updateByPrimaryKey(RptAdminIndex record);
}