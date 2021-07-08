package com.authorization_server_jwt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Bean
    public UserDetailsService uds() {

        InMemoryUserDetailsManager uds = new InMemoryUserDetailsManager();
        UserDetails u = User.withUsername("john")
                .password(new BCryptPasswordEncoder(12).encode("12345"))
                .authorities("read")
                .build();
        UserDetails u2 = User.withUsername("john1")
                .password(new BCryptPasswordEncoder(12).encode("123456"))
                .authorities("read")
                .build();
        uds.createUser(u);
        uds.createUser(u2);
        return uds;
    }

    // process incoming password and secret
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(12);
    }

    @Bean
    public AuthenticationManager authenticationManagerBean()
            throws Exception {
        return super.authenticationManagerBean();
    }
}