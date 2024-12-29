package org.example.qnafrontendjavafx.core.loader;

import org.example.qnafrontendjavafx.core.event.IEvent;
import org.example.qnafrontendjavafx.core.page.presentation.IPage;

public interface IPageRegistry {
    void register(IEvent event, IPage page);
    IPage get(IEvent event);
}