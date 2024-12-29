package org.example.qnafrontendjavafx.core.loader;

import javafx.stage.Stage;
import org.example.qnafrontendjavafx.core.event.IEvent;
import org.example.qnafrontendjavafx.core.page.presentation.IPage;

public interface IPageLoader {
    void register(IEvent event, IPage page);
    void start(Stage primaryStage, IEvent event);
    void show(IEvent type);
}