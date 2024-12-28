package org.example.qnafrontendjavafx.application.domain.general.user.signup.request;

import org.example.qnafrontendjavafx.application.domain.general.user.signup.service.GeneralUser;

public class GeneralUserSignUpRequest {
//    private final ObjectMapper objectMapper = new ObjectMapper();

    public void signUp(String url, GeneralUser user) {
        System.out.println("url: " + url + " " + user);
//        try {
//            Response response = Post.getResponse(url, getRequestBody(user));
//            return getSignUpResponse(response);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
    }

//    private static String getRequestBody(GeneralUser user) {
//        return JsonFormatter.formatJson(user);
//    }
//
//    private GeneralUserSignUpResponse getSignUpResponse(Response response) throws Exception {
//        GeneralUserSignUpResponse signUpResponse = objectMapper.readValue(response.getBody(), GeneralUserSignUpResponse.class);
//        signUpResponse.setStatusCode(response.getStatusCode());
//        return signUpResponse;
//    }
}
