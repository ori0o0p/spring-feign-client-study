package com.example.feignclient.client;

import com.example.feignclient.dto.GetUserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "user", url = "https://jsonplaceholder.typicode.com")
public interface UserClient {

    @GetMapping("/users")
    List<GetUserResponse> getUser();

}
