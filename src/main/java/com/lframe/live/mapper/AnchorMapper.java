package com.lframe.live.mapper;

import com.lframe.live.pojo.Anchor;
import com.lframe.live.pojo.AnchorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnchorMapper {
    int countByExample(AnchorExample example);

    int deleteByExample(AnchorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Anchor record);

    int insertSelective(Anchor record);

    List<Anchor> selectByExample(AnchorExample example);

    Anchor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Anchor record, @Param("example") AnchorExample example);

    int updateByExample(@Param("record") Anchor record, @Param("example") AnchorExample example);

    int updateByPrimaryKeySelective(Anchor record);

    int updateByPrimaryKey(Anchor record);
}