package com.example.sp5_chap12.config;

import com.example.sp5_chap12.controller.ChangePwdController;
import com.example.sp5_chap12.controller.LoginController;
import com.example.sp5_chap12.controller.RegisterController;
import com.example.sp5_chap12.spring.AuthService;
import com.example.sp5_chap12.spring.ChangePasswordService;
import com.example.sp5_chap12.spring.MemberRegisterService;
import com.example.sp5_chap12.survey.SurveyController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {

    @Autowired
    private MemberRegisterService memberRegSvc;

    @Autowired
    private AuthService authService;

    @Autowired
    private ChangePasswordService changePasswordService;

    @Bean
    public RegisterController registerController() {
        RegisterController controller = new RegisterController();
        controller.setMemberRegisterService(memberRegSvc);
        return controller;
    }

    @Bean
    public SurveyController surveyController() {
        return new SurveyController();
    }

    @Bean
    public LoginController loginController() {
        LoginController controller = new LoginController();
        controller.setAuthService(authService);
        return controller;
    }

    @Bean
    public ChangePwdController changePwdController() {
        ChangePwdController controller = new ChangePwdController();
        controller.setChangePasswordService(changePasswordService);
        return controller;
    }
}
