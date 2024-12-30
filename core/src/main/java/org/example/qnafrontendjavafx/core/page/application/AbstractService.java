package org.example.qnafrontendjavafx.core.page.application;

import org.example.qnafrontendjavafx.core.page.shared.IUser;

public abstract class AbstractService {
    protected IUser user;

    public AbstractService(IUser user) {
        this.user = user;
    }

    public AbstractService() {
        this.user = null;
    }
}
