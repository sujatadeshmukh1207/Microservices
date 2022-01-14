package com.persistent.semicolon.userservice.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.persistent.semicolon.userservice.dto.UserRegistrationDto;
import com.persistent.semicolon.userservice.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
