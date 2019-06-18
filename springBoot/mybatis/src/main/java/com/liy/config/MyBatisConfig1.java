package com.liy.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.liy.mapper",sqlSessionFactoryRef = "sqlSessionFactoryBean1",
sqlSessionTemplateRef = "sqlSessionTemplate1")
public class MyBatisConfig1 {

    @Resource(name = "dsOne")
    DataSource dsOne;

    @Bean
    SqlSessionFactory sqlSessionFactoryBean1(){
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dsOne);
        SqlSessionFactory factory = null;
        try {
            factory = factoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    @Bean
    SqlSessionTemplate sqlSessionTemplate1(){
        return new SqlSessionTemplate(sqlSessionFactoryBean1());
    }

}
