package org.example.qnafrontendjavafx.application.domain.signin.service;

import org.example.qnafrontendjavafx.application.domain.signin.request.SignInRequest;

public class SignInService {
    private final SignInRequest request;

    public SignInService(SignInRequest request) {
        this.request = request;
    }

    public void login(String id, String password) {
        request.login("", new User(id, password));
    }
}
