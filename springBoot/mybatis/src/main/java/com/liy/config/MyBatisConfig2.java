package com.liy.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.liy.mapper2",sqlSessionFactoryRef = "sqlSessionFactoryBean2",
sqlSessionTemplateRef = "sqlSessionTemplate2")
public class MyBatisConfig2 {

    @Resource(name = "dsTwo")
    DataSource dsTwo;

    @Bean
    SqlSessionFactory sqlSessionFactoryBean2(){
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dsTwo);
        SqlSessionFactory factory = null;
        try {
            factory = factoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    @Bean
    SqlSessionTemplate sqlSessionTemplate2(){
        return new SqlSessionTemplate(sqlSessionFactoryBean2());
    }

}
