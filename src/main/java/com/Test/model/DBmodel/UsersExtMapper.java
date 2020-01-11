package com.Test.model.DBmodel;

import com.Test.model.DBmodel.UsersExt;
import com.Test.model.DBmodel.UsersExtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersExtMapper {
    long countByExample(UsersExtExample example);

    int deleteByExample(UsersExtExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UsersExt record);

    int insertSelective(UsersExt record);

    List<UsersExt> selectByExample(UsersExtExample example);

    UsersExt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UsersExt record, @Param("example") UsersExtExample example);

    int updateByExample(@Param("record") UsersExt record, @Param("example") UsersExtExample example);

    int updateByPrimaryKeySelective(UsersExt record);

    int updateByPrimaryKey(UsersExt record);
}