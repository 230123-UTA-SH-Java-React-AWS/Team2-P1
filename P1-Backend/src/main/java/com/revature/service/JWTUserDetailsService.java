package com.revature.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.revature.model.UserAccount;
import com.revature.repository.UserAccountRepository;

@Service
public class JWTUserDetailsService implements UserDetailsService {

    private final UserAccountRepository userAccountRepository;

    public JWTUserDetailsService(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        UserAccount userAccount = userAccountRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username)));
        return new UserAccount(userAccount.getUsername(), userAccount.getPassword());
    }

}