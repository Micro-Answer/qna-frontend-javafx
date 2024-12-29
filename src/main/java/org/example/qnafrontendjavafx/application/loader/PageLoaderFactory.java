package org.example.qnafrontendjavafx.application.loader;

import org.example.qnafrontendjavafx.application.page.expert.user.signup.FactoryExpertUserSignUpPage;
import org.example.qnafrontendjavafx.application.page.general.user.signup.FactoryGeneralUserSignUpPage;
import org.example.qnafrontendjavafx.application.page.signin.FactorySignInPage;
import org.example.qnafrontendjavafx.core.loader.IPageLoader;

public class PageLoaderFactory {
    private static volatile IPageLoader pageLoader;

    public static IPageLoader getPageLoader() {
        if (pageLoader == null) {
            synchronized (PageLoader.class) {
                if (pageLoader == null) {
                    final var eventBus = new PageEventBus();
                    final var generalUserSignUpPage = FactoryGeneralUserSignUpPage.getPage(eventBus);
                    final var expertUserSignUpPage = FactoryExpertUserSignUpPage.getPage(eventBus);
                    final var signInPage = FactorySignInPage.getPage(eventBus);
                    final var pageRegistry = new PageRegistry(generalUserSignUpPage, expertUserSignUpPage, signInPage);
                    final var pageLoader = new PageLoader(pageRegistry);

                    eventBus.register(pageLoader);

                    return pageLoader;
                }
            }
        }
        return pageLoader;
    }
}
