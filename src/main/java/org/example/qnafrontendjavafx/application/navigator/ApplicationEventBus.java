package org.example.qnafrontendjavafx.application.navigator;

import org.example.qnafrontendjavafx.core.presentation.navigator.PageEventBus;
import org.example.qnafrontendjavafx.core.presentation.navigator.PageNavigator;
import org.example.qnafrontendjavafx.core.presentation.page.PageType;

public class ApplicationEventBus implements PageEventBus {
    private PageNavigator pageNavigator;

    @Override
    public void register(PageNavigator pageNavigator) {
        this.pageNavigator = pageNavigator;
    }

    @Override
    public void publish(PageType pageType) {
        pageNavigator.show(pageType);
    }
}
