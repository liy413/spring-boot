package com.liy.service;

import com.liy.dao1.BookDao1;
import com.liy.dao2.BookDao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
@Transactional
public class BookService {

    @Autowired
    BookDao1 bd1;

    @Resource
    BookDao2 bd2;


    public int update(int id,String auther){
        return bd1.update(id,auther);
    }


    public int update1(int id,String auther){
        return bd2.update1(id,auther);
    }

}
