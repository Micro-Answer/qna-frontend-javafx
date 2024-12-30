package org.example.qnafrontendjavafx;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.qnafrontendjavafx.core.page.shared.IUser;
import org.example.qnafrontendjavafx.developer.event.*;
import org.example.qnafrontendjavafx.developer.page.shared.User;
import org.example.qnafrontendjavafx.developer.page.task.expert.user.signup.InjectorExpertUserSignUp;
import org.example.qnafrontendjavafx.developer.page.task.general.user.signup.InjectorGeneralUserSignUp;
import org.example.qnafrontendjavafx.developer.page.task.mypage.InjectorMyPage;
import org.example.qnafrontendjavafx.developer.page.task.signin.InjectorSignIn;
import org.example.qnafrontendjavafx.framework.loader.PageLoaderProvider;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        IUser user = new User();

        var pageLoader = PageLoaderProvider.builder()
                .register(new ExpertUserSignUpEvent(), InjectorExpertUserSignUp.getPage(user))
                .register(new GeneralUserSignUpEvent(), InjectorGeneralUserSignUp.getPage(user))
                .register(new SignInEvent(), InjectorSignIn.getPage(user))
                .register(new MyPageEvent(), InjectorMyPage.getPage(user))
                .build()
                .getPageLoader();

        pageLoader.start(stage, new SignInEvent());
    }

    public static void main(String[] args) {
        launch();
    }
}