package org.example.qnafrontendjavafx.application.domain.signin.request;

import org.example.qnafrontendjavafx.application.domain.signin.service.User;

public class SignInRequest {

    public void login(String url, User user) {
        System.out.println("url: " + url + " " + user);
    }
}
