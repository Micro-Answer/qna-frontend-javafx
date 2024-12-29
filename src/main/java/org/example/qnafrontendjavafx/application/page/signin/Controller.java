package org.example.qnafrontendjavafx.application.page.signin;

import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import org.example.qnafrontendjavafx.core.page.presentation.IController;
import org.example.qnafrontendjavafx.core.page.presentation.IEventPublisher;

import static org.example.qnafrontendjavafx.application.loader.PageType.*;

class Controller implements IController {
    private final IEventPublisher publisher;
    private final Service service;

    Controller(IEventPublisher publisher, Service service) {
        this.publisher = publisher;
        this.service = service;
    }

    @Override
    public Pane getLayout() {
        VBox layout = new VBox(10);

        TextField idField = new TextField();
        idField.setPromptText("ID");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        Button loginButton = new Button("Login");
        Button generalUserSignUpButton = new Button("Sign Up as General user");
        Button expertUserSignUpButton = new Button("Sign Up as Expert user");

        loginButton.setOnAction(e -> onLoginButtonClick(idField.getText(), passwordField.getText()));
        generalUserSignUpButton.setOnAction(e -> onGeneralUserSignUpButtonClick());
        expertUserSignUpButton.setOnAction(e -> onExpertUserSignUpButtonClick());

        layout.getChildren().addAll(idField, passwordField, loginButton, generalUserSignUpButton, expertUserSignUpButton);

        return layout;
    }

    /**
     * <b> 역할: 로그인 </b>
     */
    private void onLoginButtonClick(String id, String pw) {
        System.out.println("Sign in");
        service.login(id, pw);
        publisher.publish(LOGIN_PAGE);
    }

    /**
     * <b> 역할: 일반 유저 회원가입 요청 </b>
     */
    private void onGeneralUserSignUpButtonClick() {
        System.out.println("general user Sign up");
        publisher.publish(GENERAL_USER_SIGN_UP_PAGE);
    }

    /**
     * <b> 역할: 전문가 유저 회원가입 요청 </b>
     */
    private void onExpertUserSignUpButtonClick() {
        System.out.println("expert user Sign up");
        publisher.publish(EXPERT_SIGN_UP_PAGE);
    }
}
