package com.wangyingjie.service;

import com.github.pagehelper.PageInfo;
import com.wangyingjie.bean.Message;

import java.util.List;

/**
 * Created by dllo on 17/8/21.
 */
public interface MessageService {
    List<Message> findAllMsg();

    PageInfo<Message>queryPage(Integer pageNum, Integer pageSize);
}
