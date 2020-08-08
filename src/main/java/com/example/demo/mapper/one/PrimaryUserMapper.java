package com.example.demo.mapper.one;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface PrimaryUserMapper {
    List<User> findAll();
}
