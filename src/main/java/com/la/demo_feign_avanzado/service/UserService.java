package com.la.demo_feign_avanzado.service;

import com.la.demo_feign_avanzado.restclient.placeholder.iclient.UserClient;
import com.la.demo_feign_avanzado.restclient.placeholder.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserClient userClient;

    public User getUserById(Long id) {
        return userClient.getUserById(id, "Bearer your-token-here");
    }
}
