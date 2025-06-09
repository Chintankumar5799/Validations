//package com.example.demo.security;
//
//import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication.Type;
//import org.springframework.boot.autoconfigure.security.ConditionalOnDefaultWebSecurity;
//import org.springframework.boot.autoconfigure.security.SecurityProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@ConditionalOnWebApplication(type=Type.SERVLET)
//public class SpringBootWebSecurityConfiguration {
//	
//	@Configuration(proxyBeanMethods = false)
//	@ConditionalOnDefaultWebSecurity
//	static class SecurityFilterChainConfiguration{
//		
//		@Bean
//		@Order(SecurityProperties.BASIC_AUTH_ORDER)
//		SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
//			http.authorizeHttpRequests().anyRequest().authenticated(); //Protect all type of path using anyRequest
//			http.formLogin(); //  apply security in above line for UI 
//			http.httpBasic(); // request without UI
//			return http.build(); 
//		}
//		
//	}
//
//}
