package com.lframe.live.mapper;

import com.lframe.live.pojo.AnchorLabel;
import com.lframe.live.pojo.AnchorLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnchorLabelMapper {
    int countByExample(AnchorLabelExample example);

    int deleteByExample(AnchorLabelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnchorLabel record);

    int insertSelective(AnchorLabel record);

    List<AnchorLabel> selectByExample(AnchorLabelExample example);

    AnchorLabel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnchorLabel record, @Param("example") AnchorLabelExample example);

    int updateByExample(@Param("record") AnchorLabel record, @Param("example") AnchorLabelExample example);

    int updateByPrimaryKeySelective(AnchorLabel record);

    int updateByPrimaryKey(AnchorLabel record);
}