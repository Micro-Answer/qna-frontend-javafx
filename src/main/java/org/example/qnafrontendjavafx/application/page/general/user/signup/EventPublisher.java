package org.example.qnafrontendjavafx.application.page.general.user.signup;

import org.example.qnafrontendjavafx.core.loader.IPageEventBus;
import org.example.qnafrontendjavafx.core.page.presentation.IEventPublisher;
import org.example.qnafrontendjavafx.core.loader.IPageType;

class EventPublisher implements IEventPublisher {
    private final IPageEventBus eventBus;

    EventPublisher(IPageEventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override
    public void publish(IPageType pageType) {
        eventBus.publish(pageType);
    }
}
