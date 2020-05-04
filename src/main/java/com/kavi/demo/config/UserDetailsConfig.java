package com.kavi.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserDetailsConfig extends WebSecurityConfigurerAdapter {
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		User.UserBuilder userBuilder = User.builder().passwordEncoder(encoder::encode);
		UserDetails user1 = userBuilder.username("user1").password("password1").roles("USER").build();
		UserDetails user2 = userBuilder.username("user2").password("password2").roles("USER").build();
		UserDetails user3 = userBuilder.username("user3").password("password3").roles("USER", "ADMIN").build();
		return new InMemoryUserDetailsManager(user1, user2, user3);
	}
}
