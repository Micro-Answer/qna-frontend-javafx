package org.example.qnafrontendjavafx.developer.page.task.expert.user.signup;

import org.example.qnafrontendjavafx.core.page.application.AbstractService;

class Service extends AbstractService {
    private final Request request;

    Service(Request request) {
        this.request = request;
    }

    void signUp(String id, String password) {
        request.signUp(new EntityExpertUser(id, password));
    }
}
