package com.lframe.live.mapper;

import com.lframe.live.pojo.VirtualMoney;
import com.lframe.live.pojo.VirtualMoneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VirtualMoneyMapper {
    int countByExample(VirtualMoneyExample example);

    int deleteByExample(VirtualMoneyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VirtualMoney record);

    int insertSelective(VirtualMoney record);

    List<VirtualMoney> selectByExample(VirtualMoneyExample example);

    VirtualMoney selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VirtualMoney record, @Param("example") VirtualMoneyExample example);

    int updateByExample(@Param("record") VirtualMoney record, @Param("example") VirtualMoneyExample example);

    int updateByPrimaryKeySelective(VirtualMoney record);

    int updateByPrimaryKey(VirtualMoney record);
}