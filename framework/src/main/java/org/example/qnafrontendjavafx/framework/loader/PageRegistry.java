package org.example.qnafrontendjavafx.framework.loader;

import org.example.qnafrontendjavafx.core.loader.IPageRegistry;
import org.example.qnafrontendjavafx.core.event.IEvent;
import org.example.qnafrontendjavafx.core.page.presentation.AbstractIPage;

import java.util.HashMap;
import java.util.Map;

class PageRegistry implements IPageRegistry {
    private final Map<IEvent, AbstractIPage> pages = new HashMap<>();

    @Override
    public void register(IEvent event, AbstractIPage page) {
        pages.put(event, page);
    }

    @Override
    public AbstractIPage get(IEvent event) {
        return pages.get(event);
    }
}