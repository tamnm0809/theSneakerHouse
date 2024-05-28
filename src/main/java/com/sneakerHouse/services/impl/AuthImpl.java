package com.sneakerHouse.services.impl;

import com.sneakerHouse.entity.Role;
import com.sneakerHouse.entity.User;
import com.sneakerHouse.repository.UserRepository;
import com.sneakerHouse.request.LoginRequest;
import com.sneakerHouse.request.RegisterRequest;
import com.sneakerHouse.response.AuthResponse;
import com.sneakerHouse.services.AuthService;
import com.sneakerHouse.services.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthImpl implements AuthService {

    private final UserRepository userRepository;

    private final JwtService jwtService;

    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;

    @Override
    public AuthResponse login(LoginRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserDetails user = userRepository.findByUsername(request.getUsername()).orElseThrow();
        String token = jwtService.getToken(user);
        return AuthResponse
                .builder()
                .token(token)
                .build();
    }

    @Override
    public AuthResponse register(RegisterRequest request) {
        User user = User.builder().username(request.getUsername())
                .id(request.getId())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .name(request.getName())
                .image(request.getImage())
                .gender(request.isGender())
                .birthday(request.getBirthday())
                .email(request.getEmail())
                .phone(request.getPhone())
                .date_create(request.getDate_create())
                .active(request.isActive())
                .build();
        userRepository.save(user);
        return AuthResponse
                .builder()
                .token(jwtService.getToken(user))
                .build();
    }
}
