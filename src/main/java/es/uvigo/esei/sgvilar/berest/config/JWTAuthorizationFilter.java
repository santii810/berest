package es.uvigo.esei.sgvilar.berest.config;

import org.springframework.security.authentication.AuthenticationManager;

import javax.servlet.Filter;

public class JWTAuthorizationFilter implements Filter {
    public JWTAuthorizationFilter(AuthenticationManager authenticationManager) {
    }
}
