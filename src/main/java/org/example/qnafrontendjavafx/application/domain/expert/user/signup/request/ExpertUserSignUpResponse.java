package org.example.qnafrontendjavafx.application.domain.expert.user.signup.request;

public class ExpertUserSignUpResponse {
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
        return String.format("SignUpResponse{result='%s', statusCode=%d}", result, statusCode);
    }
}
