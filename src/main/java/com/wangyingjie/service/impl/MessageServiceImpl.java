package com.wangyingjie.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangyingjie.bean.Message;
import com.wangyingjie.mapper.MessageMapper;
import com.wangyingjie.service.MessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/8/21.
 */

@Service
public class MessageServiceImpl implements MessageService {

    @Resource
    private MessageMapper mapper;
    public List<Message> findAllMsg() {

        List<Message> allMsg = mapper.findAllMsg();

        return allMsg;
    }

    public PageInfo<Message> queryPage(Integer pageNum, Integer pageSize) {

        pageNum = pageNum == null ? 1 : pageNum;
        pageSize = pageSize == null ? 5 : pageSize;
        PageHelper.startPage(pageNum, pageSize);
        List<Message> list = mapper.findAllMsg();
        //使用pageInfo对查询结果进行包装
        PageInfo<Message>pageInfo = new PageInfo<Message>(list);
        System.out.println(pageInfo + "-------");

        return pageInfo;
    }


}
