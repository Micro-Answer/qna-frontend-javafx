package org.example.qnafrontendjavafx.application.domain.signin.request;

public class SignInResponse {
    private String result;
    private int statusCode;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return String.format("SignInResponse{result='%s', statusCode=%d}", result, statusCode);
    }
}
