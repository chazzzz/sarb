package org.sarb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by chazz on 5/24/2015.
 */
@Configuration
@EnableWebMvc
public class ResourcesConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("/public/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/public/js/");
        registry.addResourceHandler("/img/**").addResourceLocations("/public/img/");
    }

    @Bean
    public InternalResourceViewResolver resourceViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix("/WEB-INF/views/jsp/");
        bean.setSuffix(".jsp");

        return bean;
    }
}
