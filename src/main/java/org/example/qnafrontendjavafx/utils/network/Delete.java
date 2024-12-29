package org.example.qnafrontendjavafx.utils.network;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class Delete {
    private final static HttpClient client = HttpClient.newHttpClient();

    public static MyHttpResponse getResponse(String url) throws Exception {
        HttpRequest request = getRequest(url);
        java.net.http.HttpResponse<String> httpResponse = client.send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
        return new MyHttpResponse(httpResponse.statusCode(), httpResponse.body());
    }

    // HTTP 요청 생성
    private static HttpRequest getRequest(String url) {
        return HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .DELETE()
                .build();
    }
}
