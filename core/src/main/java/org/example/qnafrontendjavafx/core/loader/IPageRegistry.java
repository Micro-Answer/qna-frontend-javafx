package org.example.qnafrontendjavafx.core.loader;

import org.example.qnafrontendjavafx.core.event.IEvent;
import org.example.qnafrontendjavafx.core.page.presentation.AbstractIPage;

public interface IPageRegistry {
    void register(IEvent event, AbstractIPage page);
    AbstractIPage get(IEvent event);
}