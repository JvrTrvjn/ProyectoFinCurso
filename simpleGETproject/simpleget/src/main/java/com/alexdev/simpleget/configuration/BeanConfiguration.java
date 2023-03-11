package com.alexdev.simpleget.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alexdev.simpleget.services.BookServiceImpl;

@Configuration
public class BeanConfiguration {
    
    @Bean
    public BookServiceImpl getBookServiceImpls(){
        return new BookServiceImpl();
    }
}
