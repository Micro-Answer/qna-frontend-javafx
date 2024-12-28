package org.example.qnafrontendjavafx.application.domain.general.user.signup.page;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import org.example.qnafrontendjavafx.core.presentation.page.Controller;
import org.example.qnafrontendjavafx.core.presentation.page.EventPublisher;
import org.example.qnafrontendjavafx.application.domain.general.user.signup.service.GeneralUserSignUpService;

import static org.example.qnafrontendjavafx.application.navigator.ApplicationPageType.LOGIN_PAGE;

class GeneralUserSignUpController implements Controller {
    private final EventPublisher publisher;
    private final GeneralUserSignUpService service;

    GeneralUserSignUpController(EventPublisher publisher, GeneralUserSignUpService service) {
        this.publisher = publisher;
        this.service = service;
    }

    public Pane getLayout() {
        VBox layout = new VBox(10);

        TextField idField = new TextField();
        idField.setPromptText("ID");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        Button signUpButton = new Button("Sign Up");
        Button homeButton = new Button("Home");

        signUpButton.setOnAction(e -> onSignUpButtonClick(idField.getText(), passwordField.getText()));
        homeButton.setOnAction(e -> onHomeButtonClick());

        layout.getChildren().addAll(idField, passwordField, signUpButton, homeButton);

        return layout;
    }

    /**
     * <b> 역할: 일반 유저 회원가입 요청 처리 </b>
     * <p>
     * - 사용자가 입력한 정보로 회원가입 시도 <br>
     * </p>
     */
    void onSignUpButtonClick(String id, String pw) {
        if (id.isEmpty() || pw.isEmpty()) {
            alert();
        } else {
            service.signUp(id, pw);
            System.out.println("Sign up");
            publisher.publish(LOGIN_PAGE);
        }
    }

    private void alert() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Sign Up Error");
        alert.setHeaderText(null);
        alert.setContentText("Please fill out all fields.");
        alert.showAndWait();
    }

    /**
     * <b> 역할: 홈 화면으로 이동 </b>
     */
    void onHomeButtonClick() {
        publisher.publish(LOGIN_PAGE);
        System.out.println("Go Home");
    }
}
