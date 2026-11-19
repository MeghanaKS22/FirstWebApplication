package com.skyllx.firstwebapplication.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticateService {


    public boolean authenticate(String username, String password) {
         boolean usernameResult=username.equalsIgnoreCase("meghana");
        boolean passwordResult=password.equalsIgnoreCase("shankar");
        return usernameResult & passwordResult;


    }
}
