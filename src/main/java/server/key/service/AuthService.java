package server.key.service;

import server.key.web.dto.auth.JwtRequest;
import server.key.web.dto.auth.JwtResponse;

public interface AuthService {
    JwtResponse login(JwtRequest loginRequest);
    JwtResponse refresh(String refreshToken);
}
