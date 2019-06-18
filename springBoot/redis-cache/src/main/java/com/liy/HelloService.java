package com.liy;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "c1",keyGenerator ="mykeyGenerator")
public class HelloService {

    @Cacheable
    public User hello(int id ){

        User u = new User();
        u.setId(id);
        u.setName("liy");
        System.out.println(u);
        return u;
    }

    @CachePut
    public User update(int id){
        User u = new User();
        u.setId(id);
        u.setName("wangwu");
        return u;
    }

    @CacheEvict
    public void delete(int id){

    }
}
