package org.example.qnafrontendjavafx.application.loader;

import org.example.qnafrontendjavafx.application.event.*;
import org.example.qnafrontendjavafx.application.page.expert.user.signup.InjectorExpertUserSignUp;
import org.example.qnafrontendjavafx.application.page.general.user.signup.InjectorGeneralUserSignUp;
import org.example.qnafrontendjavafx.application.page.signin.InjectorSignIn;
import org.example.qnafrontendjavafx.core.loader.*;

public class InjectorPageLoader {

    public static IPageLoader getPageLoader() {
        final var eventBus = new PageEventBus();
        final var publisher = new EventPublisher(eventBus);
        final var registry = new PageRegistry();

        registry.register(new GeneralUserSignUpEvent(), InjectorGeneralUserSignUp.getPage(publisher));
        registry.register(new ExpertUserSignUpEvent(), InjectorExpertUserSignUp.getPage(publisher));
        registry.register(new SignInEvent(), InjectorSignIn.getPage(publisher));

        final var pageLoader = new PageLoaderWithEventListener(registry);
        eventBus.register(pageLoader);

        return pageLoader;
    }
}
