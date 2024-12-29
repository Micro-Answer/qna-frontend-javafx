module org.example.qnafrontendjavafx {
    requires javafx.controls;
    requires java.net.http;
    requires qna.frontend.javafx.core;
    requires qna.frontend.javafx.framework;
    requires qna.frontend.javafx.event;
    requires qna.frontend.javafx.page;

    exports org.example.qnafrontendjavafx;
}