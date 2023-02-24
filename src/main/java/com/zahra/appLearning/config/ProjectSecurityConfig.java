package com.zahra.appLearning.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{

        httpSecurity.authorizeHttpRequests().mvcMatchers("/home/**").permitAll()
                .mvcMatchers("/courses").denyAll()
                .mvcMatchers("/contact").permitAll()
                .mvcMatchers("/about").permitAll()
                .and().formLogin().and().httpBasic();




    }








}
