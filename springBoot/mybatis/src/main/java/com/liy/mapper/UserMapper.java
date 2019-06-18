package com.liy.mapper;

import com.liy.bean.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    //@Select("select * from user")
    public List<User> selectAll();
}
