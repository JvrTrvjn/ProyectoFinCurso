package com.alexdev.simpleget.configuration;

import com.alexdev.simpleget.services.OrderServiceImpl;
import com.alexdev.simpleget.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alexdev.simpleget.services.BookServiceImpl;

@Configuration
public class BeanConfiguration {
    
    @Bean
    public BookServiceImpl getBookServiceImpls(){
        return new BookServiceImpl();
    }
    @Bean
    public UserServiceImpl UserServiceImpls(){
        return new UserServiceImpl();
    }
    @Bean
    public OrderServiceImpl OrderServiceImpls(){
        return new OrderServiceImpl();
    }
}


