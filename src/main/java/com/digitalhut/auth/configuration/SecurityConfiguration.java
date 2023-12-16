package com.digitalhut.auth.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.digitalhut.auth.dao.UserDao;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
//    @Bean
//    public DataSource dataSource() {
//        return new EmbeddedDatabaseBuilder()
//            .setType(EmbeddedDatabaseType.H2)
//            .addScript(JdbcDaoImpl.DEFAULT_USER_SCHEMA_DDL_LOCATION)
//            .build();
//    }
//	@Autowired
//	private UserDao userDao;
//
//    @Bean
//    public UserDetailsManager users(DataSource dataSource) {
//    	PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
//        UserDetails user = User.
//            .username("user")
//            .password("password")
//            .roles("USER")
//            .build();
//        JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
//        users.createUser(user);
//        return users;
//    }
	@Bean
    public SecurityFilterChain securityFilter(HttpSecurity http) {
//		 http.cors();
//	        http.csrf().disable()
//	                .authorizeRequests().antMatchers("/authenticate", "/registerNewUser").permitAll()
//	                .antMatchers(HttpHeaders.ALLOW).permitAll()
//	                .anyRequest().authenticated()
//	                .and()
//	                .exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint)
//	                .and()
//	                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//	        ;
		http.authorizeHttpRequests(auth ->{
			auth.requestMatchers(...patterns: "/*").permitAll()
			auth.
		}).build();
		
    }
}
