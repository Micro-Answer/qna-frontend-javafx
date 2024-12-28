package org.example.qnafrontendjavafx.application.domain.expert.user.signup.request;

import org.example.qnafrontendjavafx.application.domain.expert.user.signup.service.ExpertUser;

public class ExpertUserSignUpRequest {

    public void signUp(String url, ExpertUser user) {
        System.out.println("url: " + url + " " + user);
    }
}
