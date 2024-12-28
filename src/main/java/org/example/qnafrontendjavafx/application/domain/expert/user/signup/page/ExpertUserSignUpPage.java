package org.example.qnafrontendjavafx.application.domain.expert.user.signup.page;

import org.example.qnafrontendjavafx.application.domain.expert.user.signup.request.ExpertUserSignUpRequest;
import org.example.qnafrontendjavafx.application.domain.expert.user.signup.service.ExpertUserSignUpService;
import org.example.qnafrontendjavafx.core.presentation.navigator.PageEventBus;
import org.example.qnafrontendjavafx.core.presentation.page.Controller;
import org.example.qnafrontendjavafx.core.presentation.page.Page;

public class ExpertUserSignUpPage extends Page {
    private static volatile ExpertUserSignUpPage page;

    private ExpertUserSignUpPage(Controller controller) {
        super("Expert User Sign Up", controller);
    }

    public static ExpertUserSignUpPage getPage(PageEventBus eventBus) {
        if (page == null) {
            final var request = new ExpertUserSignUpRequest();
            final var service = new ExpertUserSignUpService(request);
            final var publisher = new ExpertUserSignUpPublisher(eventBus);
            final var controller = new ExpertUserSignUpController(publisher, service);
            page = new ExpertUserSignUpPage(controller);
        }
        return page;
    }
}