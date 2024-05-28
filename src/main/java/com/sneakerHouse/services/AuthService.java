package com.sneakerHouse.services;

import com.sneakerHouse.request.LoginRequest;
import com.sneakerHouse.request.RegisterRequest;
import com.sneakerHouse.response.AuthResponse;

public interface AuthService {
    
    public AuthResponse login(LoginRequest request);

    public AuthResponse register(RegisterRequest request);
}
