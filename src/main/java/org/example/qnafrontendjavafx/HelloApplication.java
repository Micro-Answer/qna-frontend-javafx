package org.example.qnafrontendjavafx;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.qnafrontendjavafx.application.domain.expert.user.signup.page.ExpertUserSignUpPage;
import org.example.qnafrontendjavafx.application.navigator.ApplicationEventBus;
import org.example.qnafrontendjavafx.application.navigator.ApplicationPageNavigator;
import org.example.qnafrontendjavafx.application.navigator.ApplicationPageRegistry;
import org.example.qnafrontendjavafx.application.domain.general.user.signup.page.GeneralUserSignUpPage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        final var eventBus = new ApplicationEventBus();
        final var generalUserSignUpPage = GeneralUserSignUpPage.getPage(eventBus);
        final var expertUserSignUpPage = ExpertUserSignUpPage.getPage(eventBus);
        final var pageRegistry = new ApplicationPageRegistry(generalUserSignUpPage, expertUserSignUpPage);
        final var pageNavigator = new ApplicationPageNavigator(pageRegistry);

        eventBus.register(pageNavigator);

        pageNavigator.start(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}