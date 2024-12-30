package org.example.qnafrontendjavafx.developer.page.task.expert.user.signup;

import org.example.qnafrontendjavafx.core.page.application.AbstractService;
import org.example.qnafrontendjavafx.core.page.shared.IUser;

class Service extends AbstractService {
    private final Request request;

    Service(Request request, IUser user) {
        super(user);
        this.request = request;
    }

    void signUp(String id, String password) {
        request.signUp(new EntityExpertUser(id, password));
    }
}
