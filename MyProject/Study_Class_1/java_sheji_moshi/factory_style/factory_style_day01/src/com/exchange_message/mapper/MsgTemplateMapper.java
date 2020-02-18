package com.exchange_message.mapper;

import com.exchange_message.pojo.MsgTemplate;
import com.exchange_message.pojo.MsgTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsgTemplateMapper {
    int countByExample(MsgTemplateExample example);

    int deleteByExample(MsgTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MsgTemplate record);

    int insertSelective(MsgTemplate record);

    List<MsgTemplate> selectByExampleWithBLOBs(MsgTemplateExample example);

    List<MsgTemplate> selectByExample(MsgTemplateExample example);

    MsgTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MsgTemplate record, @Param("example") MsgTemplateExample example);

    int updateByExampleWithBLOBs(@Param("record") MsgTemplate record, @Param("example") MsgTemplateExample example);

    int updateByExample(@Param("record") MsgTemplate record, @Param("example") MsgTemplateExample example);

    int updateByPrimaryKeySelective(MsgTemplate record);

    int updateByPrimaryKeyWithBLOBs(MsgTemplate record);

    int updateByPrimaryKey(MsgTemplate record);
}