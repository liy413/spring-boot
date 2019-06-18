package com.liy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.convert.Delimiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
public class JdbcTemplateConfig {
    @Resource(name = "dsOne")
    DataSource dsone;
    @Autowired
    @Qualifier("dsTwo")
    DataSource dsTwo;

    @Bean
    public JdbcTemplate one(){
        return new JdbcTemplate(dsone);
    }


    @Bean
    public JdbcTemplate two(){
        return new JdbcTemplate(dsTwo);
    }
}
