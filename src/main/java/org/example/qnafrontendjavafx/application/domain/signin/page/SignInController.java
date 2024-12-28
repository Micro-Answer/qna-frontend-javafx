package org.example.qnafrontendjavafx.application.domain.signin.page;

import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import org.example.qnafrontendjavafx.application.domain.signin.service.SignInService;
import org.example.qnafrontendjavafx.core.presentation.page.Controller;
import org.example.qnafrontendjavafx.core.presentation.page.EventPublisher;

import static org.example.qnafrontendjavafx.application.navigator.ApplicationPageType.*;

class SignInController implements Controller {
    private final EventPublisher publisher;
    private final SignInService service;

    SignInController(EventPublisher publisher, SignInService service) {
        this.publisher = publisher;
        this.service = service;
    }

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
    void onLoginButtonClick(String id, String pw) {
        System.out.println("Sign in");
        service.login(id, pw);
        publisher.publish(LOGIN_PAGE);
    }

    /**
     * <b> 역할: 일반 유저 회원가입 요청 </b>
     */
    void onGeneralUserSignUpButtonClick() {
        System.out.println("general user Sign up");
        publisher.publish(GENERAL_USER_SIGN_UP_PAGE);
    }

    /**
     * <b> 역할: 전문가 유저 회원가입 요청 </b>
     */
    void onExpertUserSignUpButtonClick() {
        System.out.println("expert user Sign up");
        publisher.publish(EXPERT_SIGN_UP_PAGE);
    }
}
