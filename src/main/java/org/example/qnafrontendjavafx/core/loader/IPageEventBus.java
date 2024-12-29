package org.example.qnafrontendjavafx.core.loader;

public interface IPageEventBus {
    void register(IPageLoader pageNavigator);
    void publish(IPageType pageType);
}
