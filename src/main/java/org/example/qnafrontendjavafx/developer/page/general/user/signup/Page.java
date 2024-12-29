package org.example.qnafrontendjavafx.developer.page.general.user.signup;

import javafx.scene.Scene;
import org.example.qnafrontendjavafx.core.page.presentation.IPage;
import org.example.qnafrontendjavafx.core.page.presentation.IController;

class Page implements IPage {
    private final String title;
    private final IController controller;

    Page(IController controller) {
        this.title = "General User Sign Up";
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