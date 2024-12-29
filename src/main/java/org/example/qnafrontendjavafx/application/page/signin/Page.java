package org.example.qnafrontendjavafx.application.page.signin;

import javafx.scene.Scene;
import org.example.qnafrontendjavafx.core.page.presentation.IController;
import org.example.qnafrontendjavafx.core.page.presentation.IPage;

class Page implements IPage {
    private final String title;
    private final IController controller;

    Page(IController controller) {
        this.title = "Sign In";
        this.controller = controller;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Scene getScene(int width, int height) {
        return new Scene(controller.getLayout(), width, height);
    }
}