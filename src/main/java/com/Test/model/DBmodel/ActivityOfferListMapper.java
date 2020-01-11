package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ActivityOfferList;
import com.Test.model.DBmodel.ActivityOfferListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityOfferListMapper {
    long countByExample(ActivityOfferListExample example);

    int deleteByExample(ActivityOfferListExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(ActivityOfferList record);

    int insertSelective(ActivityOfferList record);

    List<ActivityOfferList> selectByExampleWithBLOBs(ActivityOfferListExample example);

    List<ActivityOfferList> selectByExample(ActivityOfferListExample example);

    ActivityOfferList selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") ActivityOfferList record, @Param("example") ActivityOfferListExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityOfferList record, @Param("example") ActivityOfferListExample example);

    int updateByExample(@Param("record") ActivityOfferList record, @Param("example") ActivityOfferListExample example);

    int updateByPrimaryKeySelective(ActivityOfferList record);

    int updateByPrimaryKeyWithBLOBs(ActivityOfferList record);

    int updateByPrimaryKey(ActivityOfferList record);
}