package com.example.demo.mapper.two;


import com.example.demo.bean.User;
import com.example.demo.bean.UserVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface SecondaryUserMapper {
    List<UserVo> findAll();
}