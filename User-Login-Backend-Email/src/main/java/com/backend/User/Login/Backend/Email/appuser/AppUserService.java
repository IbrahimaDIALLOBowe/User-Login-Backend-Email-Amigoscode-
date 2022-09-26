package com.backend.User.Login.Backend.Email.appuser;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppUserService implements UserDetailsService { // THis is how we find user when we try to log in
    // here we are implementing a class or an interface for Spring Security

    private final static String USER_NOT_FOUND_MSG =
            "user with email % not found";
    private final AppUserRepository appUserRepository; // We are not adding the constructor because we want use Lombok, so we will be using @AllArgsConstructor
    @Override
    // in this part we are trying to find a way to find a User by Username. In our case the Username will be the email
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        return appUserRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, email)));

    }
}
