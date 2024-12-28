package org.example.qnafrontendjavafx.application.domain.signin.page;

import org.example.qnafrontendjavafx.core.presentation.navigator.PageEventBus;
import org.example.qnafrontendjavafx.core.presentation.page.EventPublisher;
import org.example.qnafrontendjavafx.core.presentation.page.PageType;

class SignInPublisher implements EventPublisher {
    private final PageEventBus eventBus;

    SignInPublisher(PageEventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override
    public void publish(PageType pageType) {
        eventBus.publish(pageType);
    }
}
