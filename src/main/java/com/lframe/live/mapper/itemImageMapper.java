package com.lframe.live.mapper;

import com.lframe.live.pojo.ItemImage;
import com.lframe.live.pojo.ItemImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemImageMapper {
    int countByExample(ItemImageExample example);

    int deleteByExample(ItemImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ItemImage record);

    int insertSelective(ItemImage record);

    List<ItemImage> selectByExample(ItemImageExample example);

    ItemImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ItemImage record, @Param("example") ItemImageExample example);

    int updateByExample(@Param("record") ItemImage record, @Param("example") ItemImageExample example);

    int updateByPrimaryKeySelective(ItemImage record);

    int updateByPrimaryKey(ItemImage record);
}