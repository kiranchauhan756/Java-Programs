package com.shopping.portal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Kiran@gmail.com").password(passworEndoder().encode("password"))
				.roles("USER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/").permitAll().antMatchers("/**")
				.hasAnyRole("USER").anyRequest().authenticated().and().formLogin().loginPage("/")
				.loginProcessingUrl("/signin").defaultSuccessUrl("/home").permitAll().and().logout().permitAll();
	}

	@Bean
	public BCryptPasswordEncoder passworEndoder() {
		return new BCryptPasswordEncoder();
	}

}
