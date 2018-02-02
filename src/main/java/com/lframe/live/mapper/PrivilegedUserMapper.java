package com.lframe.live.mapper;

import com.lframe.live.pojo.PrivilegedUser;
import com.lframe.live.pojo.PrivilegedUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrivilegedUserMapper {
    int countByExample(PrivilegedUserExample example);

    int deleteByExample(PrivilegedUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PrivilegedUser record);

    int insertSelective(PrivilegedUser record);

    List<PrivilegedUser> selectByExample(PrivilegedUserExample example);

    PrivilegedUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PrivilegedUser record, @Param("example") PrivilegedUserExample example);

    int updateByExample(@Param("record") PrivilegedUser record, @Param("example") PrivilegedUserExample example);

    int updateByPrimaryKeySelective(PrivilegedUser record);

    int updateByPrimaryKey(PrivilegedUser record);
}