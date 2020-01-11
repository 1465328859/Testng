package com.Test.model.DBmodel;

import com.Test.model.DBmodel.AdminAuthAccess;
import com.Test.model.DBmodel.AdminAuthAccessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminAuthAccessMapper {
    long countByExample(AdminAuthAccessExample example);

    int deleteByExample(AdminAuthAccessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminAuthAccess record);

    int insertSelective(AdminAuthAccess record);

    List<AdminAuthAccess> selectByExample(AdminAuthAccessExample example);

    AdminAuthAccess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminAuthAccess record, @Param("example") AdminAuthAccessExample example);

    int updateByExample(@Param("record") AdminAuthAccess record, @Param("example") AdminAuthAccessExample example);

    int updateByPrimaryKeySelective(AdminAuthAccess record);

    int updateByPrimaryKey(AdminAuthAccess record);
}