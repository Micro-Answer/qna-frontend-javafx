package org.example.qnafrontendjavafx.developer.page.general.user.signup;

import org.example.qnafrontendjavafx.core.loader.IEventPublisher;
import org.example.qnafrontendjavafx.core.page.presentation.IPage;

public class InjectorGeneralUserSignUp {
    private static volatile IPage page;

    public static IPage getPage(IEventPublisher eventPublisher) {
        if (page == null) {
            synchronized (Page.class) {
                if (page == null) {
                    final var request = new Request();
                    final var service = new Service(request);
                    final var controller = new Controller(eventPublisher, service);
                    page = new Page(controller);
                }
            }
        }
        return page;
    }
}