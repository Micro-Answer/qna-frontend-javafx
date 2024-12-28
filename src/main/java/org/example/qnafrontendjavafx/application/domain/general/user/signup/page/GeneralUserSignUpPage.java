package org.example.qnafrontendjavafx.application.domain.general.user.signup.page;

import org.example.qnafrontendjavafx.core.presentation.navigator.PageEventBus;
import org.example.qnafrontendjavafx.core.presentation.page.Page;
import org.example.qnafrontendjavafx.core.presentation.page.Controller;
import org.example.qnafrontendjavafx.application.domain.general.user.signup.request.GeneralUserSignUpRequest;
import org.example.qnafrontendjavafx.application.domain.general.user.signup.service.GeneralUserSignUpService;

public class GeneralUserSignUpPage extends Page {
    private static volatile GeneralUserSignUpPage page;

    private GeneralUserSignUpPage(Controller controller) {
        super("General User Sign Up", controller);
    }

    public static GeneralUserSignUpPage getPage(PageEventBus eventBus) {
        if (page == null) {
            final var request = new GeneralUserSignUpRequest();
            final var service = new GeneralUserSignUpService(request);
            final var publisher = new GeneralUserSignUpPublisher(eventBus);
            final var controller = new GeneralUserSignUpController(publisher, service);
            page = new GeneralUserSignUpPage(controller);
        }
        return page;
    }
//    public static GeneralUserSignUpPage getPage(ApplicationEventBus eventBus) {
//        if (page == null) {
//            synchronized (GeneralUserSignUpPage.class) {
//                if (page == null) {
//                    final var publisher = new GeneralUserSignUpPublisher(eventBus);
//                    final var controller = new GeneralUserSignUpController(publisher);
//                    page = new GeneralUserSignUpPage(controller);
//                }
//            }
//        }
//        return page;
//    }
}