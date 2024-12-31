package org.example.qnafrontendjavafx.developer.page.task.signin;

import org.example.qnafrontendjavafx.core.page.presentation.AbstractIPage;
import org.example.qnafrontendjavafx.core.page.cookie.ICookie;

public class InjectorSignIn {
    private static volatile AbstractIPage page;

    public static AbstractIPage getPage(ICookie cookie) {
        if (page == null) {
            synchronized (Page.class) {
                if (page == null) {
                    final var request = new Request();
                    final var service = new Service(request, cookie);
                    final var controller = new Controller(service);
                    page = new Page(controller);
                }
            }
        }
        return page;
    }
}
