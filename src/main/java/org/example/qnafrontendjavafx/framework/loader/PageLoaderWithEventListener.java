package org.example.qnafrontendjavafx.framework.loader;

import javafx.stage.Stage;
import org.example.qnafrontendjavafx.core.event.IEvent;
import org.example.qnafrontendjavafx.core.loader.IEventListener;
import org.example.qnafrontendjavafx.core.loader.IPageLoader;
import org.example.qnafrontendjavafx.core.loader.IPageRegistry;
import org.example.qnafrontendjavafx.core.page.presentation.IPage;

class PageLoaderWithEventListener implements IPageLoader, IEventListener {
    private final IPageRegistry pageRegistry;
    private Stage stage;
    private int width;
    private int height;

    PageLoaderWithEventListener(IPageRegistry pageRegistry) {
        this.pageRegistry = pageRegistry;
        width = 500;
        height = 400;
    }

    @Override
    public void start(Stage primaryStage, IEvent event) {
        this.stage = primaryStage;
        show(event);
    }

    @Override
    public void show(IEvent event) {
        IPage page = pageRegistry.get(event);
        stage.setScene(page.getScene(width, height));
        stage.setTitle(page.getTitle());
        stage.show();
    }
}
