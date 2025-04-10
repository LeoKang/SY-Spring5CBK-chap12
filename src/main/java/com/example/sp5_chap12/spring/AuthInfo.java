package com.example.sp5_chap12.spring;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AuthInfo {
    private Long id;
    private String email;
    private String name;
}
