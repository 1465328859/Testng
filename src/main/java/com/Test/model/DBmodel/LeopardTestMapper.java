package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LeopardTest;
import com.Test.model.DBmodel.LeopardTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeopardTestMapper {
    long countByExample(LeopardTestExample example);

    int deleteByExample(LeopardTestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LeopardTest record);

    int insertSelective(LeopardTest record);

    List<LeopardTest> selectByExample(LeopardTestExample example);

    LeopardTest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LeopardTest record, @Param("example") LeopardTestExample example);

    int updateByExample(@Param("record") LeopardTest record, @Param("example") LeopardTestExample example);

    int updateByPrimaryKeySelective(LeopardTest record);

    int updateByPrimaryKey(LeopardTest record);
}