package com.example.OAuth2Resourceserver.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class ResourceServerConfig  {

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests((authz) -> authz
//                        .antMatchers("/articles1").hasAuthority("SCOPE_access-articles1")
//                        .anyRequest().authenticated()
//                )
//                .oauth2ResourceServer().jwt();
//        return http.build();
//    }
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.mvcMatcher("/articles1")
                .authorizeRequests()
                .mvcMatchers("/articles1")
                .access("hasAuthority('SCOPE_access-articles')")
                .and()
                .oauth2ResourceServer()
                .jwt();
        return http.build();
    }


}
