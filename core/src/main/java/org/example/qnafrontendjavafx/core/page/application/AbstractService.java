package org.example.qnafrontendjavafx.core.page.application;

import org.example.qnafrontendjavafx.core.page.cookie.ICookie;

public abstract class AbstractService {
    protected ICookie cookie;

    public AbstractService(ICookie cookie) {
        this.cookie = cookie;
    }

    public AbstractService() {
        this.cookie = null;
    }
}
