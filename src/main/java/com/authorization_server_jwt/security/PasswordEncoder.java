package com.authorization_server_jwt.security;

public interface PasswordEncoder {
    String hashPassword(String password);
}
