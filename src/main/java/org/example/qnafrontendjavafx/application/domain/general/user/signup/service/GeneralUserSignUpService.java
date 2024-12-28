package org.example.qnafrontendjavafx.application.domain.general.user.signup.service;

import org.example.qnafrontendjavafx.application.domain.general.user.signup.request.GeneralUserSignUpRequest;

public class GeneralUserSignUpService {
    private final GeneralUserSignUpRequest request;

    public GeneralUserSignUpService(GeneralUserSignUpRequest request) {
        this.request = request;
    }

    public void signUp(String id, String password) {
        request.signUp("", new GeneralUser(id, password));
    }
}
