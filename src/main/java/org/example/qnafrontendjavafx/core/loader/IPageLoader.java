package org.example.qnafrontendjavafx.core.loader;

import javafx.stage.Stage;

public interface IPageLoader {
    void start(Stage primaryStage);
    void show(IPageType type);
}