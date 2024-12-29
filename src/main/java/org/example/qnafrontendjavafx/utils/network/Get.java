package org.example.qnafrontendjavafx.utils.network;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class Get {
    private final static HttpClient client = HttpClient.newHttpClient();

    public static MyHttpResponse getResponse(String url) throws Exception {
        HttpRequest request = getRequest(url);
        java.net.http.HttpResponse<String> httpResponse = client.send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
        return new MyHttpResponse(httpResponse.statusCode(), httpResponse.body());
    }

    private static HttpRequest getRequest(String url) {
        return HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Accept", "application/json")
                .GET()
                .build();
    }
}
