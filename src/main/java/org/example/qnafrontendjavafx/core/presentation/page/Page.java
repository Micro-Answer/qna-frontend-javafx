package org.example.qnafrontendjavafx.core.presentation.page;

import javafx.scene.Scene;

public abstract class Page {
    private final String title;
    private final Controller controller;

    public Page(String title, Controller controller) {
        this.title = title;
        this.controller = controller;
    }

    public final String getTitle() {
        return title;
    }

    public final Scene getScene(int width, int height) {
        return new Scene(controller.getLayout(), width, height);
    }
}
