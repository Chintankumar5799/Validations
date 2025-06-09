//package com.example.demo.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//public class ProjectSecurityConfig {
//
//	@Bean
//	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
//		
//		 http
//         .authorizeHttpRequests(auth -> auth
//             .requestMatchers(new AntPathRequestMatcher("/validate")).permitAll()
//             .requestMatchers(new AntPathRequestMatcher("/validateEntity")).authenticated()
//             .anyRequest().denyAll()
//         )
//         .formLogin()
//         .and()
//         .httpBasic();
//
//     return http.build();
//	}
//}
