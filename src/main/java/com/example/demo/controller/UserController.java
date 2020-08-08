package com.example.demo.controller;

import com.example.demo.base.BaseController;
import com.example.demo.bean.User;
import com.example.demo.bean.UserVo;
import com.example.demo.mapper.one.PrimaryUserMapper;
import com.example.demo.mapper.two.SecondaryUserMapper;
import com.example.demo.page.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController extends BaseController {
    @Autowired
    private PrimaryUserMapper  primaryUserMapper;
    @Autowired
    private SecondaryUserMapper secondaryUserMapper;
    /**
     *    获取第一个数据库数据
     */
    @RequestMapping("primary")
    public TableDataInfo primary(){
        startPage();
        List<User> list = primaryUserMapper.findAll();
        return getDataTable(list);
    }
    /**
     *    获取第二个数据库数据
     */
    @RequestMapping("secondary")
    public Object secondary  (){
        List<UserVo> list = secondaryUserMapper.findAll();
        return list;
    }

}
