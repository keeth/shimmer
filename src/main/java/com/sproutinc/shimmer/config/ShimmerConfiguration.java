package com.sproutinc.shimmer.config;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.sproutinc.shimmer.controller.ExitController;
import com.sproutinc.shimmer.controller.PreferenceController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

/**
 * @author InMobi Inc
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {ExitController.class, PreferenceController.class})
public class ShimmerConfiguration {

    @Bean
    ContentNegotiatingViewResolver contentNegotiatingViewResolver() {
        ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();

        resolver.setMediaTypes(ImmutableMap.of(
                "json", "application/json",
                "html", "text/html"
        ));

        resolver.setDefaultViews(Lists.<View>newArrayList(
                new MappingJacksonJsonView()
        ));
        
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        resolver.setViewResolvers(Lists.<ViewResolver>newArrayList(
                viewResolver
        ));

        resolver.setDefaultContentType(MediaType.APPLICATION_JSON);
        
        return resolver;
    }
}
