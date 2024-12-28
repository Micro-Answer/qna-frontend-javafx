package org.example.qnafrontendjavafx.application.domain.expert.user.signup.page;

import org.example.qnafrontendjavafx.core.presentation.navigator.PageEventBus;
import org.example.qnafrontendjavafx.core.presentation.page.EventPublisher;
import org.example.qnafrontendjavafx.core.presentation.page.PageType;

class ExpertUserSignUpPublisher implements EventPublisher {
    private final PageEventBus eventBus;

    ExpertUserSignUpPublisher(PageEventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override
    public void publish(PageType pageType) {
        eventBus.publish(pageType);
    }
}
