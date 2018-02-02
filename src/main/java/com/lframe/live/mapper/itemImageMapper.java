package com.lframe.live.mapper;

import com.lframe.live.pojo.itemImage;
import com.lframe.live.pojo.itemImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface itemImageMapper {
    int countByExample(itemImageExample example);

    int deleteByExample(itemImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(itemImage record);

    int insertSelective(itemImage record);

    List<itemImage> selectByExample(itemImageExample example);

    itemImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") itemImage record, @Param("example") itemImageExample example);

    int updateByExample(@Param("record") itemImage record, @Param("example") itemImageExample example);

    int updateByPrimaryKeySelective(itemImage record);

    int updateByPrimaryKey(itemImage record);
}