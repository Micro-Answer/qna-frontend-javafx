package org.example.qnafrontendjavafx.framework.loader;

import org.example.qnafrontendjavafx.core.loader.IEventPublisher;
import org.example.qnafrontendjavafx.core.loader.IPageEventBus;
import org.example.qnafrontendjavafx.core.event.IEvent;

class EventPublisher implements IEventPublisher {
    private final IPageEventBus eventBus;

    EventPublisher(IPageEventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override
    public void publish(IEvent event) {
        eventBus.publish(event);
    }
}
