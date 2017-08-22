package com.wangyingjie.mapper;

import com.wangyingjie.bean.Message;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dllo on 17/8/21.
 */
@Repository
public interface MessageMapper {
    List<Message> findAllMsg();

    void insertNewMsg(Message message);




}
