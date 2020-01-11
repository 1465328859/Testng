package com.Test.model.DBmodel;

import com.Test.model.DBmodel.AdminMenu;
import com.Test.model.DBmodel.AdminMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminMenuMapper {
    long countByExample(AdminMenuExample example);

    int deleteByExample(AdminMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminMenu record);

    int insertSelective(AdminMenu record);

    List<AdminMenu> selectByExample(AdminMenuExample example);

    AdminMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminMenu record, @Param("example") AdminMenuExample example);

    int updateByExample(@Param("record") AdminMenu record, @Param("example") AdminMenuExample example);

    int updateByPrimaryKeySelective(AdminMenu record);

    int updateByPrimaryKey(AdminMenu record);
}