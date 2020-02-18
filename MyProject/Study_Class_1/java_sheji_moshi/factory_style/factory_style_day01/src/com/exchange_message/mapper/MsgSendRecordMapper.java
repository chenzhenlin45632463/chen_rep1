package com.exchange_message.mapper;

import com.exchange_message.pojo.MsgSendRecord;
import com.exchange_message.pojo.MsgSendRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsgSendRecordMapper {
    int countByExample(MsgSendRecordExample example);

    int deleteByExample(MsgSendRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MsgSendRecord record);

    int insertSelective(MsgSendRecord record);

    List<MsgSendRecord> selectByExample(MsgSendRecordExample example);

    MsgSendRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MsgSendRecord record, @Param("example") MsgSendRecordExample example);

    int updateByExample(@Param("record") MsgSendRecord record, @Param("example") MsgSendRecordExample example);

    int updateByPrimaryKeySelective(MsgSendRecord record);

    int updateByPrimaryKey(MsgSendRecord record);
}