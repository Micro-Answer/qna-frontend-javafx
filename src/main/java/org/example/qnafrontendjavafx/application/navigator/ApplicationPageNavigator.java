package org.example.qnafrontendjavafx.application.navigator;

import javafx.stage.Stage;
import org.example.qnafrontendjavafx.core.presentation.page.Page;
import org.example.qnafrontendjavafx.core.presentation.navigator.PageNavigator;
import org.example.qnafrontendjavafx.core.presentation.page.PageType;

import java.util.Map;

import static org.example.qnafrontendjavafx.application.navigator.ApplicationPageType.GENERAL_USER_SIGN_UP_PAGE;

public class ApplicationPageNavigator implements PageNavigator {
    private final Map<PageType, Page> pages;
    private Stage stage;
    private int width;
    private int height;

    /**
     * <b> 페이지 객체를 맵에 저장 </b>
     */
    public ApplicationPageNavigator(ApplicationPageRegistry pageRegistry) {
        pages = pageRegistry.getPages();
        width = 500;
        height = 400;
    }

    @Override
    public void start(Stage primaryStage) {
        this.stage = primaryStage;
        show(GENERAL_USER_SIGN_UP_PAGE);
    }

    @Override
    public void show(PageType type) {
        Page page = pages.get(type);
        stage.setScene(page.getScene(width, height));
        stage.setTitle(page.getTitle());
        stage.show();
    }
}
