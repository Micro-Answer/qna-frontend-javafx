module qna.frontend.javafx.page {
    requires javafx.controls;
    requires qna.frontend.javafx.core;
    requires qna.frontend.javafx.event;

    exports org.example.qnafrontendjavafx.developer.page.expert.user.signup;
    exports org.example.qnafrontendjavafx.developer.page.general.user.signup;
    exports org.example.qnafrontendjavafx.developer.page.signin;
}