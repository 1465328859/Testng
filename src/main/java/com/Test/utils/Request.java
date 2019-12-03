package com.Test.utils;

import com.Test.config.TestConfig;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;

public class Request {
    public String get(String url) throws IOException {
        HttpGet httpGet = new HttpGet();
        httpGet.addHeader("Content-Type","application/json;charset=utf-8");
        httpGet.setURI(URI.create(url));
        HttpResponse httpResponse = TestConfig.defaultHttpClient.execute(httpGet);
        String result = EntityUtils.toString(httpResponse.getEntity());
        return result;
    }
    public void get(int a){

    }
    public void post(){

    }
    public void post(int a){

    }
}
