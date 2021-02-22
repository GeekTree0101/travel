package com.shawn.mltravel.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("travel/admin/login");
        registry.addViewController("login.html").setViewName("travel/admin/login");
        registry.addViewController("admin.html").setViewName("travel/admin/index");
        registry.addViewController("welcome.html").setViewName("travel/admin/welcome");
        registry.addViewController("member-list.html").setViewName("travel/user/member-list");
        registry.addViewController("member-add.html").setViewName("travel/user/member-add");
        registry.addViewController("member-delete.html").setViewName("travel/user/member-delete");
        registry.addViewController("member-level.html").setViewName("travel/user/member-level");
        registry.addViewController("order-list.html").setViewName("travel/admin/order-list");
        registry.addViewController("order-add.html").setViewName("travel/admin/order-add");
        registry.addViewController("admin-list.html").setViewName("travel/admin/admin-list");
        registry.addViewController("admin-rule.html").setViewName("travel/admin/admin-rule");
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginAdminHandlerInterceptor()).addPathPatterns("/**").
                excludePathPatterns("/","/admin/login","/login.html","/css/**","/fonts/**","/images/**","/js/**","/lib/**");
    }
}
