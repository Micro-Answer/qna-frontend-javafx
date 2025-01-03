package org.example.qnafrontendjavafx.core.page.presentation;

import javafx.scene.layout.Pane;
import org.example.qnafrontendjavafx.core.loader.IEventPublisher;
import org.example.qnafrontendjavafx.core.page.application.AbstractService;

public abstract class AbstractController {
    protected final AbstractService service;
    protected IEventPublisher publisher;

    public AbstractController(AbstractService service) {
        this.service = service;
    }

    public AbstractController() {
        this.service = null;
    }

    public final void setEventPublisher(IEventPublisher publisher) {
        this.publisher = publisher;
    }

    public abstract Pane getLayout();
}