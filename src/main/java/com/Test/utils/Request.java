package com.Test.utils;

import com.Test.config.TestConfig;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import javax.sql.rowset.spi.SyncResolver;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Request {
    public String get(String url) throws IOException {
        HttpGet httpGet = new HttpGet();
        httpGet.addHeader("Content-Type","application/json;charset=utf-8");
        httpGet.setURI(URI.create(url));
        HttpResponse httpResponse = TestConfig.defaultHttpClient.execute(httpGet);
        String result = EntityUtils.toString(httpResponse.getEntity());
        return result;
    }
    public void get(){

    }
    public String post(String url,Map<String,String> formParams){
        HttpPost httpPost = new HttpPost();
        //httpPost.addHeader("Content-Type","application/json;charset=utf-8");
        httpPost.setURI(URI.create(url));
        System.out.println(url);
        String result = new String();
        try {
            UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(paramsAdapter(formParams), "utf-8");
            httpPost.setEntity(uefEntity);
            HttpResponse httpResponse=TestConfig.defaultHttpClient.execute(httpPost);
            result=EntityUtils.toString(httpResponse.getEntity());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    public String post(String url, String json){
        HttpPost httpPost=new HttpPost();
        //httpPost.addHeader("Content-Type","application/json;charset=utf-8");
        httpPost.setURI(URI.create(url));
        System.out.println(url);
        String result = new String();
        try {
            StringEntity entity = new StringEntity(json,"UTF-8");
            httpPost.setEntity(entity);
            HttpResponse httpResponse = TestConfig.defaultHttpClient.execute(httpPost);
            result = EntityUtils.toString(httpResponse.getEntity());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * 参数适配器，将系统定义的请求参数转换成HttpClient能够接受的参数类型
     *
     *            系统定义的请求参数
     * @return HttpClient要求的参数类型
     */
    private static List<NameValuePair> paramsAdapter(Map<String, String> map) {
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
        return nvps;
    }
}
