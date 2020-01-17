package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GamePtUsers;
import com.Test.model.DBmodel.GamePtUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GamePtUsersMapper {
    long countByExample(GamePtUsersExample example);

    int deleteByExample(GamePtUsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GamePtUsers record);

    int insertSelective(GamePtUsers record);

    List<GamePtUsers> selectByExample(GamePtUsersExample example);

    GamePtUsers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GamePtUsers record, @Param("example") GamePtUsersExample example);

    int updateByExample(@Param("record") GamePtUsers record, @Param("example") GamePtUsersExample example);

    int updateByPrimaryKeySelective(GamePtUsers record);

    int updateByPrimaryKey(GamePtUsers record);
}