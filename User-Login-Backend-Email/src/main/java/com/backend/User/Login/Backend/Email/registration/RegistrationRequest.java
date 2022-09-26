package com.backend.User.Login.Backend.Email.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest { // when the client send a request we want to capture few things
    private  final String firstName;
    private  final String lastName;
    private  final String password;
    private  final String email;

}
