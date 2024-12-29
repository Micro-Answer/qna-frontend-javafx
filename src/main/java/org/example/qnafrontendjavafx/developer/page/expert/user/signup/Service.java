package org.example.qnafrontendjavafx.developer.page.expert.user.signup;

class Service {
    private final Request request;

    Service(Request request) {
        this.request = request;
    }

    void signUp(String id, String password) {
        request.signUp(new EntityExpertUser(id, password));
    }
}
