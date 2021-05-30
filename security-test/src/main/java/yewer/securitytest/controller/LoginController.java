package yewer.securitytest.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class LoginController {

    private String generateToken(String username,String passwod){
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username,passwod);
        final Authentication authentication = AuthenticationManager.authenticate(token);
        SecurityContextHolder.getContext().setAuthentication(authentication);
    }
}
