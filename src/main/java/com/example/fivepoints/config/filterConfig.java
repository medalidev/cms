package com.example.fivepoints.config;

import com.example.fivepoints.filters.new_filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class filterConfig {
    @Bean
    public FilterRegistrationBean<new_filter> registrationBean(){
        FilterRegistrationBean<new_filter>  registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new new_filter());
        registrationBean.addUrlPatterns("/customers/*");
        return registrationBean;
    }
}
