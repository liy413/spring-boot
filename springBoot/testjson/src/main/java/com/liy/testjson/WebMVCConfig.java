package com.liy.testjson;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer {
    /*@Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        converter.setCharset(Charset.forName("UTF-8"));
        List<MediaType> types = new ArrayList<>();
        types.add(MediaType.APPLICATION_JSON_UTF8);
        converter.setSupportedMediaTypes(types);
        converters.add(converter);

    }*/

    @Bean
    FastJsonHttpMessageConverter fastJsonHttpMessageConverter(){
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        converter.setCharset(Charset.forName("UTF-8"));
        List<MediaType> types = new ArrayList<>();
        types.add(MediaType.APPLICATION_JSON_UTF8);
        converter.setSupportedMediaTypes(types);
        return converter;
    }
}
