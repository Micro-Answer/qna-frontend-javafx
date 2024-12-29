package org.example.qnafrontendjavafx.framework.loader;

import org.example.qnafrontendjavafx.developer.event.*;
import org.example.qnafrontendjavafx.developer.page.expert.user.signup.InjectorExpertUserSignUp;
import org.example.qnafrontendjavafx.developer.page.general.user.signup.InjectorGeneralUserSignUp;
import org.example.qnafrontendjavafx.developer.page.signin.InjectorSignIn;
import org.example.qnafrontendjavafx.core.loader.*;

public class InjectorPageLoader {

    public static IPageLoader getPageLoader() {
        final var eventBus = new PageEventBus();
        final var publisher = new EventPublisher(eventBus);
        final var registry = new PageRegistry();

        var event1 = new GeneralUserSignUpEvent();
        var page1 = InjectorGeneralUserSignUp.getPage();
        page1.setEventPublisher(publisher);
        registry.register(event1, page1);

        var event2 = new ExpertUserSignUpEvent();
        var page2 = InjectorExpertUserSignUp.getPage();
        page2.setEventPublisher(publisher);
        registry.register(event2, page2);

        var event3 = new SignInEvent();
        var page3 = InjectorSignIn.getPage();
        page3.setEventPublisher(publisher);
        registry.register(event3, page3);

        final var pageLoader = new PageLoaderWithEventListener(registry);
        eventBus.register(pageLoader);

        return pageLoader;
    }
}
