package org.example.qnafrontendjavafx.core.loader;

import org.example.qnafrontendjavafx.core.event.IEvent;
import org.example.qnafrontendjavafx.core.page.presentation.IPage;

import java.util.Map;

public interface IPageRegistry {
    Map<IEvent, IPage> getPages();
    void register(IEvent event, IPage page);
}