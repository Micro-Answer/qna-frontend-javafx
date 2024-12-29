package org.example.qnafrontendjavafx.core.page.presentation;

import javafx.scene.layout.Pane;
import org.example.qnafrontendjavafx.core.loader.IEventPublisher;

public abstract class AbstractController {
    protected IEventPublisher publisher;

    public final void setEventPublisher(IEventPublisher publisher) {
        this.publisher = publisher;
    }

    public abstract Pane getLayout();
}