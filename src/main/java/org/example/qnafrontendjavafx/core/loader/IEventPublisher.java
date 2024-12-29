package org.example.qnafrontendjavafx.core.loader;

import org.example.qnafrontendjavafx.core.event.IEvent;

public interface IEventPublisher {
    void publish(IEvent pageType);
}
