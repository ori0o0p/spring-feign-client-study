package com.example.feignclient.service;

import com.example.feignclient.client.UserClient;
import com.example.feignclient.dto.GetUserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserClient userClient;

    public List<GetUserResponse> execute() {
        return userClient.getUser();
    }

}
