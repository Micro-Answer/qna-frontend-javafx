package org.example.qnafrontendjavafx.application.page.expert.user.signup;

import org.example.qnafrontendjavafx.core.loader.IPageEventBus;
import org.example.qnafrontendjavafx.core.page.presentation.IPage;

public class FactoryExpertUserSignUpPage {
    private static volatile IPage page;

    public static IPage getPage(IPageEventBus eventBus) {
        if (page == null) {
            synchronized (Page.class) {
                if (page == null) {
                    final var request = new Request();
                    final var service = new Service(request);
                    final var publisher = new EventPublisher(eventBus);
                    final var controller = new Controller(publisher, service);
                    page = new Page(controller);
                }
            }
        }
        return page;
    }
}
