package com.pgj.basicmodule.dao;

import com.pgj.basicmodule.model.Amount;
import com.pgj.basicmodule.model.AmountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmountMapper {
    long countByExample(AmountExample example);

    int deleteByExample(AmountExample example);

    int deleteByPrimaryKey(Long amountId);

    int insert(Amount record);

    int insertSelective(Amount record);

    List<Amount> selectByExample(AmountExample example);

    Amount selectByPrimaryKey(Long amountId);

    int updateByExampleSelective(@Param("record") Amount record, @Param("example") AmountExample example);

    int updateByExample(@Param("record") Amount record, @Param("example") AmountExample example);

    int updateByPrimaryKeySelective(Amount record);

    int updateByPrimaryKey(Amount record);
}