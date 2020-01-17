package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameCategory;
import com.Test.model.DBmodel.GameCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameCategoryMapper {
    long countByExample(GameCategoryExample example);

    int deleteByExample(GameCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameCategory record);

    int insertSelective(GameCategory record);

    List<GameCategory> selectByExample(GameCategoryExample example);

    GameCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameCategory record, @Param("example") GameCategoryExample example);

    int updateByExample(@Param("record") GameCategory record, @Param("example") GameCategoryExample example);

    int updateByPrimaryKeySelective(GameCategory record);

    int updateByPrimaryKey(GameCategory record);
}