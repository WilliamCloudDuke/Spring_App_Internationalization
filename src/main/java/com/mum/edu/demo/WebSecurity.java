package com.mum.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

	@Autowired
	public void authenticationConfig(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("ACCOUNT").password("123").roles("ACCOUNT")
		.and()
		.withUser("SALES").password("456").roles("SALES")
		.and()
		.withUser("ADMIN").password("789").roles("ADMIN");
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/international").permitAll()
		.antMatchers("/books").hasAnyRole("ACCOUNT", "ADMIN")
		.antMatchers("/addBook").hasAnyRole("ACCOUNT", "ADMIN")
		.antMatchers("/cars").hasAnyRole("SALES", "ADMIN")
		.antMatchers("/addCar").hasAnyRole("SALES", "ADMIN")
		.and()
		.formLogin();
	}

	@SuppressWarnings("deprecation")
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}

}
