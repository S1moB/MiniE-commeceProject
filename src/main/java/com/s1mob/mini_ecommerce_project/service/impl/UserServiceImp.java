package com.s1mob.mini_ecommerce_project.service.impl;

import com.s1mob.mini_ecommerce_project.models.Authorities;
import com.s1mob.mini_ecommerce_project.models.User;
import com.s1mob.mini_ecommerce_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("UserDetailsService")
public class UserServiceImp implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = userRepository.findById(username).orElseGet(User::new);
        UserBuilder builder = null;
        if (user.getUsername() != null && !user.getUsername().isEmpty()) {
            builder = org.springframework.security.core.userdetails.User.withUsername(username);
            builder.disabled(!user.isEnabled());
            builder.password(user.getPassword());
            String[] authorities = user.getAuthorities()
                    .stream().map(Authorities::getAuthority).toArray(String[]::new);

            builder.authorities(authorities);
        } else {
            throw new UsernameNotFoundException("User not found.");
        }
        return builder.build();
    }
}