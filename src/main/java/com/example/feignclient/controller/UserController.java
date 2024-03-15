package com.example.feignclient.controller;

import com.example.feignclient.dto.GetUserResponse;
import com.example.feignclient.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping
    public List<GetUserResponse> getUser() {
        return service.execute();
    }

}
