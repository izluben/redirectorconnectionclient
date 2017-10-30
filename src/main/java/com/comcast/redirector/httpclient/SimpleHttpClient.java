/* ===========================================================================
 * Copyright (c) 2017 Comcast Corp. All rights reserved.
 * ===========================================================================
 *
 * Author: Stanislav Menshykov
 * Created: 10/27/2017  4:51 PM
 */
package com.comcast.redirector.httpclient;


import com.alibaba.fastjson.JSON;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

public class SimpleHttpClient {

    private final HttpClient httpClient;
    private final String baseUri;

    public SimpleHttpClient(String baseUri) {
        this.baseUri = baseUri;
        this.httpClient = HttpClientBuilder.create().build();
    }

    public <T> void doPost(T entity, ContentType contentType, String endpoint) throws IOException {
        String jsonEntity = JSON.toJSONString(entity);

        HttpPost postRequest = new HttpPost(baseUri + endpoint);

        StringEntity input = new StringEntity(jsonEntity);
        input.setContentType(contentType.value());
        postRequest.setEntity(input);

        HttpResponse response = httpClient.execute(postRequest);

        if (response.getStatusLine().getStatusCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
        }
    }

    public enum ContentType {
        JSON("application/json"), PLAIN_TEXT("text/plain");

        private String contentTypeString;

        ContentType(String contentTypeString) {
            this.contentTypeString = contentTypeString;
        }

        public String value() {
            return contentTypeString;
        }
    }
}
