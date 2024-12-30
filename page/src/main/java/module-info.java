module qna.frontend.javafx.page {
    requires javafx.controls;
    requires qna.frontend.javafx.core;
    requires qna.frontend.javafx.event;

    exports org.example.qnafrontendjavafx.developer.page.task.expert.user.signup;
    exports org.example.qnafrontendjavafx.developer.page.task.general.user.signup;
    exports org.example.qnafrontendjavafx.developer.page.task.signin;
    exports org.example.qnafrontendjavafx.developer.page.shared;
    exports org.example.qnafrontendjavafx.developer.page.shared.behavior;
}