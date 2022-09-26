package com.backend.User.Login.Backend.Email.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class PasswordEncoder{
        @Bean // this bean annotation allow us to use the PasswordEncoder
        public BCryptPasswordEncoder bCryptPasswordEncoder(){
                return new BCryptPasswordEncoder();
        }

        }
