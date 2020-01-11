package com.Test.model.DBmodel;

import com.Test.model.DBmodel.UsersExtDesc;
import com.Test.model.DBmodel.UsersExtDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersExtDescMapper {
    long countByExample(UsersExtDescExample example);

    int deleteByExample(UsersExtDescExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UsersExtDesc record);

    int insertSelective(UsersExtDesc record);

    List<UsersExtDesc> selectByExample(UsersExtDescExample example);

    UsersExtDesc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UsersExtDesc record, @Param("example") UsersExtDescExample example);

    int updateByExample(@Param("record") UsersExtDesc record, @Param("example") UsersExtDescExample example);

    int updateByPrimaryKeySelective(UsersExtDesc record);

    int updateByPrimaryKey(UsersExtDesc record);
}