package com.example.sp5_chap12.controller;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ChangePwdCommand {
    private String currentPassword;
    private String newPassword;
}
