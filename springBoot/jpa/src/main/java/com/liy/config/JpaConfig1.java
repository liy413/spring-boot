package com.liy.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "com.liy.dao2",
        entityManagerFactoryRef = "localContainerEntityManagerFactoryBeanTwo",
        transactionManagerRef = "platformTransactionManagerTwo")
public class JpaConfig1 {

    @Autowired
    @Qualifier(value = "dsTwo")
    DataSource dsTwo;

    @Autowired
    JpaProperties jr;

    @Bean
    LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBeanTwo(EntityManagerFactoryBuilder builder){
        return builder.dataSource(dsTwo)
                .properties(jr.getProperties())
                .packages("com.liy.bean")
                .persistenceUnit("pu2")
                .build();

    }

    @Bean
    PlatformTransactionManager platformTransactionManagerTwo(EntityManagerFactoryBuilder builder){
        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = localContainerEntityManagerFactoryBeanTwo(builder);
        return new JpaTransactionManager(localContainerEntityManagerFactoryBean.getObject());
    }
}
