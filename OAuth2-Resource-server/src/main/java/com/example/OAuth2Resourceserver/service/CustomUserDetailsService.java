package com.example.OAuth2Resourceserver.service;

import com.example.OAuth2Resourceserver.entities.User;
import com.example.OAuth2Resourceserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository repos;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repos.findByName(username);
        return new org.springframework.security.core.userdetails.User(user.getName(),user.getPassword(), user.getRoles());
    }
}
