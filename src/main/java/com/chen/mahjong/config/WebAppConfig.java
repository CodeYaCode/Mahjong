package com.chen.mahjong.config;

import com.chen.mahjong.Interceptor.LoginInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

/**
 * @author LiuChen
 * @create 2019-02-17-2:31
 */
@Component
public class WebAppConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns(Arrays.asList("/login","/api/user/create", "/api/user/login", "/api/user/list"));
    }
}
