package com.Test.model.DBmodel;

import com.Test.model.DBmodel.AdminAuthRoleUser;
import com.Test.model.DBmodel.AdminAuthRoleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminAuthRoleUserMapper {
    long countByExample(AdminAuthRoleUserExample example);

    int deleteByExample(AdminAuthRoleUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminAuthRoleUser record);

    int insertSelective(AdminAuthRoleUser record);

    List<AdminAuthRoleUser> selectByExample(AdminAuthRoleUserExample example);

    AdminAuthRoleUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminAuthRoleUser record, @Param("example") AdminAuthRoleUserExample example);

    int updateByExample(@Param("record") AdminAuthRoleUser record, @Param("example") AdminAuthRoleUserExample example);

    int updateByPrimaryKeySelective(AdminAuthRoleUser record);

    int updateByPrimaryKey(AdminAuthRoleUser record);
}