package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBbinUsers;
import com.Test.model.DBmodel.GameBbinUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBbinUsersMapper {
    long countByExample(GameBbinUsersExample example);

    int deleteByExample(GameBbinUsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameBbinUsers record);

    int insertSelective(GameBbinUsers record);

    List<GameBbinUsers> selectByExample(GameBbinUsersExample example);

    GameBbinUsers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameBbinUsers record, @Param("example") GameBbinUsersExample example);

    int updateByExample(@Param("record") GameBbinUsers record, @Param("example") GameBbinUsersExample example);

    int updateByPrimaryKeySelective(GameBbinUsers record);

    int updateByPrimaryKey(GameBbinUsers record);
}