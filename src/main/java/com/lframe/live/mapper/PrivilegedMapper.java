package com.lframe.live.mapper;

import com.lframe.live.pojo.Privileged;
import com.lframe.live.pojo.PrivilegedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrivilegedMapper {
    int countByExample(PrivilegedExample example);

    int deleteByExample(PrivilegedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Privileged record);

    int insertSelective(Privileged record);

    List<Privileged> selectByExample(PrivilegedExample example);

    Privileged selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Privileged record, @Param("example") PrivilegedExample example);

    int updateByExample(@Param("record") Privileged record, @Param("example") PrivilegedExample example);

    int updateByPrimaryKeySelective(Privileged record);

    int updateByPrimaryKey(Privileged record);
}