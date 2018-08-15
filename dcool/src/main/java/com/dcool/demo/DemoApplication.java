package com.dcool.demo;

import com.dcool.demo.filter.UserSessionFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@ServletComponentScan
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean userSessionFilter()
    {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        UserSessionFilter userSessionFilter = new UserSessionFilter();
        filterRegistrationBean.setFilter(userSessionFilter);
        filterRegistrationBean.setOrder(Integer.MIN_VALUE);
        filterRegistrationBean.addUrlPatterns("/user/status/"); //指定需要过滤的URL
        return filterRegistrationBean;
    }
}
