package org.example.qnafrontendjavafx.application.navigator;

import org.example.qnafrontendjavafx.application.domain.general.user.signup.page.GeneralUserSignUpPage;
import org.example.qnafrontendjavafx.core.presentation.page.Page;
import org.example.qnafrontendjavafx.core.presentation.navigator.PageRegistry;
import org.example.qnafrontendjavafx.core.presentation.page.PageType;

import java.util.HashMap;
import java.util.Map;

import static org.example.qnafrontendjavafx.application.navigator.ApplicationPageType.GENERAL_USER_SIGN_UP_PAGE;

public class ApplicationPageRegistry implements PageRegistry {
    private final Map<ApplicationPageType, Page> applicationPages = new HashMap<>();

    public ApplicationPageRegistry(
            GeneralUserSignUpPage generalUserSignUpPage
    ) {
        applicationPages.put(GENERAL_USER_SIGN_UP_PAGE, generalUserSignUpPage);
    }

    @Override
    public Map<PageType, Page> getPages() {
        return new HashMap<>(applicationPages);
    }
}