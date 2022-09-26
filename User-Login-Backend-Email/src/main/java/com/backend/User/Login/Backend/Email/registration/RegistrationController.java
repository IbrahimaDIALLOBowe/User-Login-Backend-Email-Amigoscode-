package com.backend.User.Login.Backend.Email.registration;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/registration") // we want to change the path
@AllArgsConstructor
public class RegistrationController {

    // we have to have the reference to our service
    private RegistrationService registrationService;

    // we are going to have a method to register a person
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }
}
