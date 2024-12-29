package org.example.qnafrontendjavafx.application.loader;

import org.example.qnafrontendjavafx.core.loader.IPageEventBus;
import org.example.qnafrontendjavafx.core.loader.IPageLoader;
import org.example.qnafrontendjavafx.core.loader.IPageType;

class PageEventBus implements IPageEventBus {
    private IPageLoader pageLoader;

    @Override
    public void register(IPageLoader pageLoader) {
        this.pageLoader = pageLoader;
    }

    @Override
    public void publish(IPageType pageType) {
        pageLoader.show(pageType);
    }
}
