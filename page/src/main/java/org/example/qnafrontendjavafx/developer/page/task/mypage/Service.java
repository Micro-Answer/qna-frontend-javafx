package org.example.qnafrontendjavafx.developer.page.task.mypage;

import org.example.qnafrontendjavafx.core.page.application.AbstractService;
import org.example.qnafrontendjavafx.core.page.shared.IUser;
import org.example.qnafrontendjavafx.developer.page.shared.behavior.Role;

class Service extends AbstractService {
    private final Request request;

    Service(Request request, IUser user) {
        super(user);
        this.request = request;
    }

    MyProfile getMyProfile() {
        if (user instanceof Role role) {
            request.getMyProfile(role.getId());
            return new MyProfile(role.getId(), role.getRole());
        }
        return new MyProfile("default", "default");
    }
}