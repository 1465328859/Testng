package com.Test.utils;

import com.Test.model.mymodel.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

public class configFile {
    //从application文件中取url
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("application", Locale.CHINA);

    public static ResourceBundle getResourceBundle() {
        return resourceBundle;
    }

    public static String getUrl(InterfaceName name){
        //取域名和端口号
        String baseurl = resourceBundle.getString("test.url");
        String uri = "";
        //如果传进来的接口名称正确，就返回相应接口的url
        if(name == InterfaceName.LOGIN){
            uri = resourceBundle.getString("login.uri");
        }
        if(name == InterfaceName.Betting){
            uri = resourceBundle.getString("Betting.uri");
        }
        if(name == InterfaceName.HistoryRecording){
            uri = resourceBundle.getString("HistoryRecording.uri");
        }
        if (name == InterfaceName.GETUSERINFO){
            uri = resourceBundle.getString("getUserInfo.uri");
        }
        if(name == InterfaceName.ADDUSER){
            uri = resourceBundle.getString("addUser.uri");
        }

        //拼接url
        String testurl = baseurl + uri;
        return testurl;
    }
}

