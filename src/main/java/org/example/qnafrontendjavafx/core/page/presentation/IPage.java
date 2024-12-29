package org.example.qnafrontendjavafx.core.page.presentation;

import javafx.scene.Scene;

public interface IPage {
    String getTitle();
    Scene getScene(int width, int height);
}
