package org.example.qnafrontendjavafx.utils.network;

public class MyHttpResponse {
    private final int statusCode;
    private final String body;

    public MyHttpResponse(int statusCode, String body) {
        this.statusCode = statusCode;
        this.body = body;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return String.format("Response{statusCode=%d, body='%s'}", statusCode, body);
    }
}
