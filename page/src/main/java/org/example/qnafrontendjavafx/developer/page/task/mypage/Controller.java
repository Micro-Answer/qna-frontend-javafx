package org.example.qnafrontendjavafx.developer.page.task.mypage;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import org.example.qnafrontendjavafx.core.page.application.AbstractService;
import org.example.qnafrontendjavafx.core.page.presentation.AbstractController;
import org.example.qnafrontendjavafx.developer.event.SignInEvent;

class Controller extends AbstractController {

    Controller(AbstractService service) {
        super(service);
    }

    @Override
    public Pane getLayout() {
        VBox layout = new VBox(10);

        var id = "ID: ";
        var role = "ROLE: ";

        if (service instanceof Service user) {
            MyProfile myProfile = user.getMyProfile();
            id += myProfile.getId();
            role += myProfile.getRole();
        }

        var idLabel = new Label();
        idLabel.setText(id);

        var roleLabel = new Label();
        roleLabel.setText(role);

        Button logoutButton = new Button("Log Out");
        logoutButton.setOnAction(e -> onLogoutButtonClick());

        layout.getChildren().addAll(idLabel, roleLabel, logoutButton);

        return layout;
    }

    /**
     * <b> 역할: 로그아웃 </b>
     */
    private void onLogoutButtonClick() {
        System.out.println("logout");
        publisher.publish(new SignInEvent());
    }
}
