package com.Test.model.DBmodel;

import com.Test.model.DBmodel.AdminAuthRole;
import com.Test.model.DBmodel.AdminAuthRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminAuthRoleMapper {
    long countByExample(AdminAuthRoleExample example);

    int deleteByExample(AdminAuthRoleExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(AdminAuthRole record);

    int insertSelective(AdminAuthRole record);

    List<AdminAuthRole> selectByExample(AdminAuthRoleExample example);

    AdminAuthRole selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") AdminAuthRole record, @Param("example") AdminAuthRoleExample example);

    int updateByExample(@Param("record") AdminAuthRole record, @Param("example") AdminAuthRoleExample example);

    int updateByPrimaryKeySelective(AdminAuthRole record);

    int updateByPrimaryKey(AdminAuthRole record);
}