package com.example.onlinegamingapp.service;

import com.example.onlinegamingapp.model.Players;
import com.example.onlinegamingapp.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private PlayerRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserDetails details = null;
        Iterable<Players> users = userRepository.findAll();



        for (Players user:users){
            if(user.getUsername().equals(username))
            {

                UserDetails  normalUser = User
                        .withUsername(username)
                        .password(user.getPassword())
                        .roles(user.getRole())
                        .build();

                details = normalUser;
            }
        }


        if (details == null) {
            throw new UsernameNotFoundException("Could not find user");
        }

        return details;
    }



}
