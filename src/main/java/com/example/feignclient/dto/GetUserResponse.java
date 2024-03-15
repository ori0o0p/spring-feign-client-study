package com.example.feignclient.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GetUserResponse {
    private Integer id;
    private String username;
    private String email;
    private String phone;

}