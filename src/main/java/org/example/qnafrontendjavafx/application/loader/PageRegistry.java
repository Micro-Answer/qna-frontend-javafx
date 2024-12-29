package org.example.qnafrontendjavafx.application.loader;

import org.example.qnafrontendjavafx.core.loader.IPageRegistry;
import org.example.qnafrontendjavafx.core.loader.IPageType;
import org.example.qnafrontendjavafx.core.page.presentation.IPage;

import java.util.HashMap;
import java.util.Map;

import static org.example.qnafrontendjavafx.application.loader.PageType.*;

class PageRegistry implements IPageRegistry {
    private final Map<IPageType, IPage> pages = new HashMap<>();

    PageRegistry(
            IPage generalUserSignUpPage,
            IPage expertUserSignUpPage,
            IPage signInPage
    ) {
        pages.put(GENERAL_USER_SIGN_UP_PAGE, generalUserSignUpPage);
        pages.put(EXPERT_SIGN_UP_PAGE, expertUserSignUpPage);
        pages.put(LOGIN_PAGE, signInPage);
    }

    @Override
    public Map<IPageType, IPage> getPages() {
        return pages;
    }
}