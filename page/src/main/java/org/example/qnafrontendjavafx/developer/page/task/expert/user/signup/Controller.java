package org.example.qnafrontendjavafx.developer.page.task.expert.user.signup;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import org.example.qnafrontendjavafx.developer.event.SignInEvent;
import org.example.qnafrontendjavafx.core.page.presentation.AbstractController;

class Controller extends AbstractController {
    private final Service service;

    Controller(Service service) {
        this.service = service;
    }

    @Override
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
     * <b> 역할: 전문가 유저 회원가입 요청 처리 </b>
     * <p>
     * - 사용자가 입력한 정보로 회원가입 시도 <br>
     * </p>
     */
    private void onSignUpButtonClick(String id, String pw) {
        if (id.isEmpty() || pw.isEmpty()) {
            alert();
        } else {
            service.signUp(id, pw);
            System.out.println("Sign up");
            publisher.publish(new SignInEvent());
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
    private void onHomeButtonClick() {
        publisher.publish(new SignInEvent());
        System.out.println("Go Home");
    }
}
