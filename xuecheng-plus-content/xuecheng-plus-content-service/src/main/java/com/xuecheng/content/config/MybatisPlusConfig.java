package com.xuecheng.content.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author memcpy0
 * @version 1.0
 * @description MybatisPlus配置
 * @date 2023/4/5 14:28
 */

@Configuration
@MapperScan("com.xuecheng.content.mapper") // 扫描定义的那些Mapper
public class MybatisPlusConfig {
    /**
     * 定义分页拦截器
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL)); // 按照MySQL语法拼装分页
        return interceptor;
    }


}