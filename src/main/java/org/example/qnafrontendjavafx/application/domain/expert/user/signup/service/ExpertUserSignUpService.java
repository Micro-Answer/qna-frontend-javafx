package org.example.qnafrontendjavafx.application.domain.expert.user.signup.service;

import org.example.qnafrontendjavafx.application.domain.expert.user.signup.request.ExpertUserSignUpRequest;

public class ExpertUserSignUpService {
    private final ExpertUserSignUpRequest request;

    public ExpertUserSignUpService(ExpertUserSignUpRequest request) {
        this.request = request;
    }

    public void signUp(String id, String password) {
        request.signUp("", new ExpertUser(id, password));
    }
}
