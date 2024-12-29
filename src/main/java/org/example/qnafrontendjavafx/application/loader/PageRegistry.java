package org.example.qnafrontendjavafx.application.loader;

import org.example.qnafrontendjavafx.core.loader.IPageRegistry;
import org.example.qnafrontendjavafx.core.event.IEvent;
import org.example.qnafrontendjavafx.core.page.presentation.IPage;

import java.util.HashMap;
import java.util.Map;

class PageRegistry implements IPageRegistry {
    private final Map<IEvent, IPage> pages = new HashMap<>();

    @Override
    public void register(IEvent event, IPage page) {
        pages.put(event, page);
    }

    @Override
    public IPage get(IEvent event) {
        return pages.get(event);
    }
}