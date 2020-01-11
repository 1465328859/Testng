package com.Test.model.DBmodel;

import com.Test.model.DBmodel.AdminWhiteList;
import com.Test.model.DBmodel.AdminWhiteListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminWhiteListMapper {
    long countByExample(AdminWhiteListExample example);

    int deleteByExample(AdminWhiteListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminWhiteList record);

    int insertSelective(AdminWhiteList record);

    List<AdminWhiteList> selectByExample(AdminWhiteListExample example);

    AdminWhiteList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminWhiteList record, @Param("example") AdminWhiteListExample example);

    int updateByExample(@Param("record") AdminWhiteList record, @Param("example") AdminWhiteListExample example);

    int updateByPrimaryKeySelective(AdminWhiteList record);

    int updateByPrimaryKey(AdminWhiteList record);
}