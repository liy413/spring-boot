package com.liy;

import com.liy.bean.Book;
import com.liy.dao1.BookDao1;
import com.liy.dao2.BookDao2;
import com.liy.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {

    @Autowired
    BookDao1 db1;

    @Autowired
    BookDao2 db2;

 /*   @Autowired
    BookService bs;*/

    @Test
    public void updateMany(){
        db1.update(3,"liy1");
        db2.update1(3,"liy1");
    }

    @Test
    public void TestFind() {

        List<Book> a = db1.findBookByIdGreaterThanAndAndUsernameContains(1, "a");
        System.out.println(a);
        long l = db1.TotalCount();
        System.out.println(l);
        db1.update(3,"aaaa");
    }


    @Test
    public void contextLoads() {
        Book book = new Book("老夫子", "afaf");
        db1.save(book);
    }

    @Test
    public void update(){
        Book book = new Book("老夫子", "老夫");
        book.setId(1);
        db1.saveAndFlush(book);
    }

    @Test
    public void find(){

        List<Book> all = db1.findAll(Sort.by(new Sort.Order(Sort.Direction.DESC, "id")));
        System.out.println(all);
    }

    @Test
    public void findPage(){
        PageRequest data = PageRequest.of(0, 2);
        System.out.println(data);
        Page<Book> page = db1.findAll(data);

        System.out.println(page.getNumberOfElements());//当前记录数
        System.out.println(page.getNumber());//
        System.out.println(page.getSize());//每页应该查到的记录数
        System.out.println(page.isLast());//是否是最后一页
        System.out.println(page.isFirst());//是否是第一页
        System.out.println(page.getTotalPages());//总页数
        System.out.println(page.getTotalElements());//总记录数
        System.out.println(page.getContent());//当前页的数据

    }
}
