package com.Test.config;

import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.DefaultHttpClient;

public class TestConfig {
    public static String loginuri;
    public static String updateUserInfouri;
    public static String getUserListuri;
    public static String getUserInfouri;
    public static String addUseruri;

    public static DefaultHttpClient defaultHttpClient;
    public static CookieStore cookieStore;
}