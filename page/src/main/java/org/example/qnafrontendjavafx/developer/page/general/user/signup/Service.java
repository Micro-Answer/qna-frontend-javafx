package org.example.qnafrontendjavafx.developer.page.general.user.signup;

class Service {
    private final Request request;

    Service(Request request) {
        this.request = request;
    }

    void signUp(String id, String password) {
        request.signUp(new EntityGeneralUser(id, password));
    }
}
