package org.example.qnafrontendjavafx.developer.page.cache;

import org.example.qnafrontendjavafx.core.page.cache.IUser;
import org.example.qnafrontendjavafx.developer.page.cache.store.Role;

public class User implements IUser, Role {
    private String id;
    private String role;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }
}