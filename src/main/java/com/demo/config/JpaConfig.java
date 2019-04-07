package com.demo.config;

/**
 * @Description:
 * @Author: Rulsion
 * @Date: 2019/4/6 22:25
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.persistence.EntityManagerFactory;


@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "com.demo")
@EnableWebMvc
@EnableJpaRepositories(basePackages = "com.demo.repository")
// 用于配置扫描Repositories所在的package及子package。简单配置中的配置则等同于此项配置值，
// basePackages可以配置为单个字符串，也可以配置为字符串数组形式 多个包路径使用{}括起来
//basePackages = "com.demo.repository"
// 用于指定单个Repositorie,多个Repositories使用{}括起来
        /*  basePackageClasses = {""},
        // 过滤器
        includeFilters = {},
        // 不包含过滤器
        excludeFilters = {},
        // 实现类追加的尾部 命名约定
        repositoryImplementationPostfix = "Impl",

        //named SQL存放的位置，默认为META-INF/jpa-named-queries.properties
        namedQueriesLocation = "",META-INF/jpa-named-queries.properties

        // 构建条件查询的策略，包含三种方式CREATE，USE_DECLARED_QUERY，CREATE_IF_NOT_FOUND
        // CREATE：按照接口名称自动构建查询
        // USE_DECLARED_QUERY：用户声明查询
        // CREATE_IF_NOT_FOUND：先搜索用户声明的，不存在则自动构建
        queryLookupStrategy= QueryLookupStrategy.Key.CREATE_IF_NOT_FOUND,
        // 指定Repository的工厂类
        repositoryFactoryBeanClass= JpaRepositoryFactoryBean.class,
        // 实体管理工厂引用名称，对应到@Bean注解对应的方法
        entityManagerFactoryRef="entityManagerFactory",
        // 事务管理工厂引用名称，对应到@Bean注解对应的方法
        transactionManagerRef="transactionManager",

        // TODO
        considerNestedRepositories=false,

        // TODO
        enableDefaultTransactions=true */

public class JpaConfig {

    //springboot自动默认分别注入DataSourceTransactionManager或JpaTransactionManager不在需要额外的配置


}
