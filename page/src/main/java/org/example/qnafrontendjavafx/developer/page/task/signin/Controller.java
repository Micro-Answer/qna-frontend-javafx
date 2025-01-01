package org.example.qnafrontendjavafx.developer.page.task.signin;

import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import org.example.qnafrontendjavafx.core.page.application.AbstractService;
import org.example.qnafrontendjavafx.developer.event.ExpertUserSignUpEvent;
import org.example.qnafrontendjavafx.developer.event.GeneralUserSignUpEvent;
import org.example.qnafrontendjavafx.developer.event.MyPageEvent;
import org.example.qnafrontendjavafx.developer.event.SignInEvent;
import org.example.qnafrontendjavafx.core.page.presentation.AbstractController;

class Controller extends AbstractController {

    Controller(AbstractService service) {
        super(service);
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
        if (service instanceof Service user) {
            user.login(id, pw);
            System.out.printf("Sign in. ID: %s, pw: %s", id, pw);
            publisher.publish(new MyPageEvent());
        }
    }

    /**
     * <b> 역할: 일반 유저 회원가입 요청 </b>
     */
    private void onGeneralUserSignUpButtonClick() {
        System.out.println("general user Sign up");
        publisher.publish(new GeneralUserSignUpEvent());
    }

    /**
     * <b> 역할: 전문가 유저 회원가입 요청 </b>
     */
    private void onExpertUserSignUpButtonClick() {
        System.out.println("expert user Sign up");
        publisher.publish(new ExpertUserSignUpEvent());
    }
}
