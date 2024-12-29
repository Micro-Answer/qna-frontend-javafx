package org.example.qnafrontendjavafx.core.loader;

import javafx.stage.Stage;
import org.example.qnafrontendjavafx.core.event.IEvent;

public interface IPageLoader {
    void start(Stage primaryStage, IEvent event);
    void show(IEvent type);
}