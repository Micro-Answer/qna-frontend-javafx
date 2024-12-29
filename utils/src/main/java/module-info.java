module qna.frontend.javafx.utils {
    requires java.net.http;
    requires com.fasterxml.jackson.databind;

    exports org.example.qnafrontendjavafx.utils.network;
    exports org.example.qnafrontendjavafx.utils.formatter;
}