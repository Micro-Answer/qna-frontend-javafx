package org.example.qnafrontendjavafx.developer.page.signin;

class Service {
    private final Request request;

    Service(Request request) {
        this.request = request;
    }

    void login(String id, String password) {
        request.login(new EntityUser(id, password));
    }
}
