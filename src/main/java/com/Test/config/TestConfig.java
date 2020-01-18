package com.Test.config;

import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.DefaultHttpClient;

public class TestConfig {
    public static String loginuri;
    public static String Bettingurl;
    public static String HistoryRecordingurl;
    public static String LotteryListuri;
    public static String Registeruri;

    public static DefaultHttpClient defaultHttpClient;
    public static CookieStore cookieStore;
}