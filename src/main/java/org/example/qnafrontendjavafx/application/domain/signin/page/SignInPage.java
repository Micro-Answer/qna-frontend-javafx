package org.example.qnafrontendjavafx.application.domain.signin.page;

import org.example.qnafrontendjavafx.application.domain.signin.request.SignInRequest;
import org.example.qnafrontendjavafx.application.domain.signin.service.SignInService;
import org.example.qnafrontendjavafx.core.presentation.navigator.PageEventBus;
import org.example.qnafrontendjavafx.core.presentation.page.Controller;
import org.example.qnafrontendjavafx.core.presentation.page.Page;

public class SignInPage extends Page {
    private static volatile SignInPage page;

    private SignInPage(Controller controller) {
        super("Sign In", controller);
    }

    public static SignInPage getPage(PageEventBus eventBus) {
        if (page == null) {
            final var request = new SignInRequest();
            final var service = new SignInService(request);
            final var publisher = new SignInPublisher(eventBus);
            final var controller = new SignInController(publisher, service);
            page = new SignInPage(controller);
        }
        return page;
    }
}