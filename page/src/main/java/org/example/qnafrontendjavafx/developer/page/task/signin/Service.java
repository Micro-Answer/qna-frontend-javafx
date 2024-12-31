package org.example.qnafrontendjavafx.developer.page.task.signin;

import org.example.qnafrontendjavafx.core.page.application.AbstractService;
import org.example.qnafrontendjavafx.core.page.cache.IUser;
import org.example.qnafrontendjavafx.developer.page.cache.store.Role;

class Service extends AbstractService {
    private final Request request;

    Service(Request request, IUser user) {
        super(user);
        this.request = request;
    }

    void login(String id, String password) {
        request.login(new EntityUser(id, password));
        if (user instanceof Role role) {
            role.setId(id);
            role.setRole("temporary");
        }
    }
}
