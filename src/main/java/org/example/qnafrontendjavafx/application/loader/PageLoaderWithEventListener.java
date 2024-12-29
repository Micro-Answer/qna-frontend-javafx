package org.example.qnafrontendjavafx.application.loader;

import javafx.stage.Stage;
import org.example.qnafrontendjavafx.application.event.SignInEvent;
import org.example.qnafrontendjavafx.core.event.IEvent;
import org.example.qnafrontendjavafx.core.loader.IEventListener;
import org.example.qnafrontendjavafx.core.loader.IPageLoader;
import org.example.qnafrontendjavafx.core.loader.IPageRegistry;
import org.example.qnafrontendjavafx.core.page.presentation.IPage;

import java.util.Map;

class PageLoaderWithEventListener implements IPageLoader, IEventListener {
    private final Map<IEvent, IPage> pages;
    private Stage stage;
    private int width;
    private int height;

    /**
     * <b> 페이지 객체를 맵에 저장 </b>
     */
    PageLoaderWithEventListener(IPageRegistry pageRegistry) {
        pages = pageRegistry.getPages();
        width = 500;
        height = 400;
    }

    @Override
    public void start(Stage primaryStage) {
        this.stage = primaryStage;
        show(new SignInEvent());
    }

    @Override
    public void show(IEvent event) {
        IPage page = pages.get(event);
        stage.setScene(page.getScene(width, height));
        stage.setTitle(page.getTitle());
        stage.show();
    }
}
