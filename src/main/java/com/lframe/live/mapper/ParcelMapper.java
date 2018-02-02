package com.lframe.live.mapper;

import com.lframe.live.pojo.Parcel;
import com.lframe.live.pojo.ParcelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParcelMapper {
    int countByExample(ParcelExample example);

    int deleteByExample(ParcelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Parcel record);

    int insertSelective(Parcel record);

    List<Parcel> selectByExample(ParcelExample example);

    Parcel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Parcel record, @Param("example") ParcelExample example);

    int updateByExample(@Param("record") Parcel record, @Param("example") ParcelExample example);

    int updateByPrimaryKeySelective(Parcel record);

    int updateByPrimaryKey(Parcel record);
}