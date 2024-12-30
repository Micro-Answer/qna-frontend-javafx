package org.example.qnafrontendjavafx.developer.page.task.signin;

import org.example.qnafrontendjavafx.core.page.presentation.AbstractIPage;
import org.example.qnafrontendjavafx.core.page.shared.IUser;

public class InjectorSignIn {
    private static volatile AbstractIPage page;

    public static AbstractIPage getPage(IUser user) {
        if (page == null) {
            synchronized (Page.class) {
                if (page == null) {
                    final var request = new Request();
                    final var service = new Service(request, user);
                    final var controller = new Controller(service);
                    page = new Page(controller);
                }
            }
        }
        return page;
    }
}
