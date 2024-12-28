package org.example.qnafrontendjavafx.core.presentation.navigator;

import org.example.qnafrontendjavafx.core.presentation.page.PageType;

public interface PageEventBus {
    void register(PageNavigator pageNavigator);
    void publish(PageType pageType);
}
