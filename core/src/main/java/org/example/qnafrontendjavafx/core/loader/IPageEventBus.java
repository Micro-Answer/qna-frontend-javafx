package org.example.qnafrontendjavafx.core.loader;

import org.example.qnafrontendjavafx.core.event.IEvent;

public interface IPageEventBus {
    void register(IPageLoader pageNavigator);
    void publish(IEvent pageType);
}
