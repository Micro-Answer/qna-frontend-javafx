package org.example.qnafrontendjavafx;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.qnafrontendjavafx.application.loader.PageLoaderFactory;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        var pageLoader = PageLoaderFactory.getPageLoader();
        pageLoader.start(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}