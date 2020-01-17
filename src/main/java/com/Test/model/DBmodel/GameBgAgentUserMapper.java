package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBgAgentUser;
import com.Test.model.DBmodel.GameBgAgentUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBgAgentUserMapper {
    long countByExample(GameBgAgentUserExample example);

    int deleteByExample(GameBgAgentUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameBgAgentUser record);

    int insertSelective(GameBgAgentUser record);

    List<GameBgAgentUser> selectByExample(GameBgAgentUserExample example);

    GameBgAgentUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameBgAgentUser record, @Param("example") GameBgAgentUserExample example);

    int updateByExample(@Param("record") GameBgAgentUser record, @Param("example") GameBgAgentUserExample example);

    int updateByPrimaryKeySelective(GameBgAgentUser record);

    int updateByPrimaryKey(GameBgAgentUser record);
}