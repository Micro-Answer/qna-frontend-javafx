package org.example.qnafrontendjavafx;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.qnafrontendjavafx.core.page.cookie.ICookie;
import org.example.qnafrontendjavafx.developer.event.*;
import org.example.qnafrontendjavafx.developer.page.cookie.Cookie;
import org.example.qnafrontendjavafx.developer.page.task.expert.user.signup.InjectorExpertUserSignUp;
import org.example.qnafrontendjavafx.developer.page.task.general.user.signup.InjectorGeneralUserSignUp;
import org.example.qnafrontendjavafx.developer.page.task.mypage.InjectorMyPage;
import org.example.qnafrontendjavafx.developer.page.task.signin.InjectorSignIn;
import org.example.qnafrontendjavafx.framework.loader.PageLoaderProvider;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        ICookie cookie = new Cookie();

        var pageLoader = PageLoaderProvider.builder()
                .register(new ExpertUserSignUpEvent(), InjectorExpertUserSignUp.getPage())
                .register(new GeneralUserSignUpEvent(), InjectorGeneralUserSignUp.getPage())
                .register(new SignInEvent(), InjectorSignIn.getPage(cookie))
                .register(new MyPageEvent(), InjectorMyPage.getPage(cookie))
                .build()
                .getPageLoader();

        pageLoader.start(stage, new SignInEvent());
    }

    public static void main(String[] args) {
        launch();
    }
}