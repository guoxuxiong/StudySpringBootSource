//package com.example.demo.config;
//
//import org.apache.ibatis.session.Configuration;
//import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
//import org.springframework.context.annotation.Bean;
//
///**
// * 设置mybatis支持驼峰规则
// */
//@org.springframework.context.annotation.Configuration
//public class MybatisConfig {
//    @Bean
//    public ConfigurationCustomizer  configurationCustomizer(){
//        return new ConfigurationCustomizer(){
//
//            @Override
//            public void customize(Configuration configuration) {
//                //支持驼峰命名规则
//                configuration.setMapUnderscoreToCamelCase(true);
//            }
//        };
//
//    }
//}
