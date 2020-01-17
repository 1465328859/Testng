package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameAgUsers;
import com.Test.model.DBmodel.GameAgUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameAgUsersMapper {
    long countByExample(GameAgUsersExample example);

    int deleteByExample(GameAgUsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameAgUsers record);

    int insertSelective(GameAgUsers record);

    List<GameAgUsers> selectByExample(GameAgUsersExample example);

    GameAgUsers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameAgUsers record, @Param("example") GameAgUsersExample example);

    int updateByExample(@Param("record") GameAgUsers record, @Param("example") GameAgUsersExample example);

    int updateByPrimaryKeySelective(GameAgUsers record);

    int updateByPrimaryKey(GameAgUsers record);
}