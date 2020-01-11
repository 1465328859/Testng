package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ActivityImg;
import com.Test.model.DBmodel.ActivityImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityImgMapper {
    long countByExample(ActivityImgExample example);

    int deleteByExample(ActivityImgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityImg record);

    int insertSelective(ActivityImg record);

    List<ActivityImg> selectByExample(ActivityImgExample example);

    ActivityImg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityImg record, @Param("example") ActivityImgExample example);

    int updateByExample(@Param("record") ActivityImg record, @Param("example") ActivityImgExample example);

    int updateByPrimaryKeySelective(ActivityImg record);

    int updateByPrimaryKey(ActivityImg record);
}