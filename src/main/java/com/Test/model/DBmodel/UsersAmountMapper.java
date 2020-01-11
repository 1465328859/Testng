package com.Test.model.DBmodel;

import com.Test.model.DBmodel.UsersAmount;
import com.Test.model.DBmodel.UsersAmountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersAmountMapper {
    long countByExample(UsersAmountExample example);

    int deleteByExample(UsersAmountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UsersAmount record);

    int insertSelective(UsersAmount record);

    List<UsersAmount> selectByExample(UsersAmountExample example);

    UsersAmount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UsersAmount record, @Param("example") UsersAmountExample example);

    int updateByExample(@Param("record") UsersAmount record, @Param("example") UsersAmountExample example);

    int updateByPrimaryKeySelective(UsersAmount record);

    int updateByPrimaryKey(UsersAmount record);
}