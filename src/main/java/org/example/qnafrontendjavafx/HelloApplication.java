package org.example.qnafrontendjavafx;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.qnafrontendjavafx.developer.event.SignInEvent;
import org.example.qnafrontendjavafx.framework.loader.InjectorPageLoader;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        var pageLoader = InjectorPageLoader.getPageLoader();
        pageLoader.start(stage, new SignInEvent());
    }

    public static void main(String[] args) {
        launch();
    }
}