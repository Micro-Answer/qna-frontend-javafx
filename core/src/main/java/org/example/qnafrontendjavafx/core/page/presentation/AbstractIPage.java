package org.example.qnafrontendjavafx.core.page.presentation;

import javafx.scene.Scene;
import org.example.qnafrontendjavafx.core.loader.IEventPublisher;

public abstract class AbstractIPage {
    private final String title;
    private final AbstractController controller;

    public AbstractIPage(String title, AbstractController controller) {
        this.title = title;
        this.controller = controller;
    }

    public final String getTitle() {
        return title;
    }

    public Scene getScene(int width, int height) {
        return new Scene(controller.getLayout(), width, height);
    }

    public final void setEventPublisher(IEventPublisher publisher) {
        controller.setEventPublisher(publisher);
    }
}
