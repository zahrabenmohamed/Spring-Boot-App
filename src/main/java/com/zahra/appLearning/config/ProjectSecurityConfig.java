package com.zahra.appLearning.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{

        httpSecurity.csrf().disable()
                .authorizeHttpRequests().mvcMatchers("/home/**").permitAll()
                .mvcMatchers("/courses").authenticated()
                .mvcMatchers("/contact").authenticated() //let only authenticated user to contact the company
                .mvcMatchers("/about").authenticated()
                .and().formLogin().and().httpBasic();




    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user1").password("{noop}password1").roles("USER")
                .and()
                .withUser("user2").password("{noop}password2").roles("USER")
                .and()
                .withUser("admin").password("{noop}password3").roles("ADMIN");
    }









}
