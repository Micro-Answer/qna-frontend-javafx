package org.example.qnafrontendjavafx.application.loader;

import javafx.stage.Stage;
import org.example.qnafrontendjavafx.core.page.presentation.IPage;
import org.example.qnafrontendjavafx.core.loader.IPageLoader;
import org.example.qnafrontendjavafx.core.loader.IPageRegistry;
import org.example.qnafrontendjavafx.core.loader.IPageType;

import java.util.Map;

import static org.example.qnafrontendjavafx.application.loader.PageType.LOGIN_PAGE;

class PageLoader implements IPageLoader {
    private final Map<IPageType, IPage> pages;
    private Stage stage;
    private int width;
    private int height;

    /**
     * <b> 페이지 객체를 맵에 저장 </b>
     */
    PageLoader(IPageRegistry pageRegistry) {
        pages = pageRegistry.getPages();
        width = 500;
        height = 400;
    }

    @Override
    public void start(Stage primaryStage) {
        this.stage = primaryStage;
        show(LOGIN_PAGE);
    }

    @Override
    public void show(IPageType type) {
        IPage page = pages.get(type);
        stage.setScene(page.getScene(width, height));
        stage.setTitle(page.getTitle());
        stage.show();
    }
}
