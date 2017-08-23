package com.wangyingjie.controller;

import com.github.pagehelper.PageInfo;
import com.wangyingjie.bean.Message;
import com.wangyingjie.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/8/21.
 */

@Controller
public class MainController {

    @Resource
    private MessageService service;

    @RequestMapping(value = "/")
    public String frontPage(){
        return "user/MessageBoard";
    }

    @RequestMapping(value = "/findall")
    @ResponseBody
    public List<Message>findAllMsg(){
        List<Message> allMsg = service.findAllMsg();
        System.out.println(allMsg);
        return allMsg;
    }

    @RequestMapping(value = "/pagetest")
    @ResponseBody
    public PageInfo<Message>pageTest(){
        PageInfo<Message> pageInfo = service.queryPage(1, 2);
        return pageInfo;
    }

    @RequestMapping(value = "/gittest")
    @ResponseBody
    public String gittest(){
        return "bbb";
    }
    
    public void test(){
        System.out.println("test");
    }

    //编辑代码
    @RequestMapping(value = "/branch")
    @ResponseBody
    public String branchTest(){
        return "branch";
    }

    public void test22(){
        System.out.println("测试冲突");
    }


}
