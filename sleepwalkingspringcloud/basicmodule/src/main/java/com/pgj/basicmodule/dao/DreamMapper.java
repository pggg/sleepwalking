package com.pgj.basicmodule.dao;

import com.pgj.basicmodule.model.Dream;
import com.pgj.basicmodule.model.DreamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DreamMapper {
    long countByExample(DreamExample example);

    int deleteByExample(DreamExample example);

    int insert(Dream record);

    int insertSelective(Dream record);

    List<Dream> selectByExampleWithBLOBs(DreamExample example);

    List<Dream> selectByExample(DreamExample example);

    int updateByExampleSelective(@Param("record") Dream record, @Param("example") DreamExample example);

    int updateByExampleWithBLOBs(@Param("record") Dream record, @Param("example") DreamExample example);

    int updateByExample(@Param("record") Dream record, @Param("example") DreamExample example);
}