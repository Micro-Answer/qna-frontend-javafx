package org.example.qnafrontendjavafx.application.page.signin;

class Service {
    private final Request request;

    Service(Request request) {
        this.request = request;
    }

    void login(String id, String password) {
        request.login(new EntityUser(id, password));
    }
}
