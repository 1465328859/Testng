package com.Test.model.mymodel;

public class ApiExcel {
    //请求协议
    String protocol;
    //请求地址
    String url;
    //请求方式
    String method;
    //请求参数
    String params;
    //验证值
    String hope;
    //验证接口名
    String mark;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getHope() {
        return hope;
    }

    public void setHope(String hope) {
        this.hope = hope;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Excel{" +
                "protocol='" + protocol + '\'' +
                ", url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", params='" + params + '\'' +
                ", hope='" + hope + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
