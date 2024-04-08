package server.key.service;

import org.springframework.stereotype.Service;
import server.key.web.dto.auth.JwtRequest;
import server.key.web.dto.auth.JwtResponse;

@Service
public class AuthServiceImpl implements AuthService{
    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
