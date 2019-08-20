package com.learning.service;

import com.learning.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

/**
 * Created by Templar on 18.08.2019.
 */
public class UserService implements UserDetailsService {
//    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
//        return userRepository.findByEmail(E);
    }
}
