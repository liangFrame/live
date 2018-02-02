package com.lframe.live.mapper;

import com.lframe.live.pojo.Guard;
import com.lframe.live.pojo.GuardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GuardMapper {
    int countByExample(GuardExample example);

    int deleteByExample(GuardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Guard record);

    int insertSelective(Guard record);

    List<Guard> selectByExample(GuardExample example);

    Guard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Guard record, @Param("example") GuardExample example);

    int updateByExample(@Param("record") Guard record, @Param("example") GuardExample example);

    int updateByPrimaryKeySelective(Guard record);

    int updateByPrimaryKey(Guard record);
}