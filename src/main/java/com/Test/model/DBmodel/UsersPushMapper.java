package com.Test.model.DBmodel;

import com.Test.model.DBmodel.UsersPush;
import com.Test.model.DBmodel.UsersPushExample;
import com.Test.model.DBmodel.UsersPushWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersPushMapper {
    long countByExample(UsersPushExample example);

    int deleteByExample(UsersPushExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UsersPushWithBLOBs record);

    int insertSelective(UsersPushWithBLOBs record);

    List<UsersPushWithBLOBs> selectByExampleWithBLOBs(UsersPushExample example);

    List<UsersPush> selectByExample(UsersPushExample example);

    UsersPushWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UsersPushWithBLOBs record, @Param("example") UsersPushExample example);

    int updateByExampleWithBLOBs(@Param("record") UsersPushWithBLOBs record, @Param("example") UsersPushExample example);

    int updateByExample(@Param("record") UsersPush record, @Param("example") UsersPushExample example);

    int updateByPrimaryKeySelective(UsersPushWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UsersPushWithBLOBs record);

    int updateByPrimaryKey(UsersPush record);
}