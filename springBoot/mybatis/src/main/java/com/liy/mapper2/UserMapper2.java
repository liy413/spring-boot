package com.liy.mapper2;

import com.liy.bean.User;

import java.util.List;

public interface UserMapper2 {
    //@Select("select * from user")
    public List<User> selectAll();
}
