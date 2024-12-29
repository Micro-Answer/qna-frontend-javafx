package org.example.qnafrontendjavafx.developer.page.expert.user.signup;

import org.example.qnafrontendjavafx.core.page.presentation.IPage;

public class InjectorExpertUserSignUp {
    private static volatile IPage page;

    public static IPage getPage() {
        if (page == null) {
            synchronized (Page.class) {
                if (page == null) {
                    final var request = new Request();
                    final var service = new Service(request);
                    final var controller = new Controller(service);
                    page = new Page(controller);
                }
            }
        }
        return page;
    }
}
