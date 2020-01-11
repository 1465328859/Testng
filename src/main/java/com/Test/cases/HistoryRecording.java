package com.Test.cases;

import com.Test.config.TestConfig;
import com.Test.model.mymodel.InterfaceName;
import com.Test.utils.Request;
import com.Test.utils.configFile;
import net.sf.json.JSONObject;
import org.apache.http.impl.client.DefaultHttpClient;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HistoryRecording {
    //加@BeforeTest注解，在用例执行前先获取接口的url
    @BeforeTest(groups = "HistoryRecording",description = "历史开奖接口")
    public void beforeTest(){
        //获取接口地址
        TestConfig.HistoryRecording = configFile.getUrl(InterfaceName.HistoryRecording);
        TestConfig.defaultHttpClient = new DefaultHttpClient();
    }
    @Test(groups = "HistoryRecording", description = "历史开奖的接口")
    public void HistoryRecording() throws IOException {
        String token = LoginTest.token;
        Map map = new HashMap();
        map.put("version", "3.0");
        map.put("platform", "1");
        map.put("from", "2");
        map.put("token", token);
        String responsejosn = new Request().post(TestConfig.HistoryRecording, map);
        JSONObject jsonObject = JSONObject.fromObject(responsejosn);
        Integer resule = (Integer) jsonObject.get("result");
        if (resule != 1) {
            throw new RuntimeException(jsonObject.toString());
        } else {
            System.out.println(jsonObject.get("msg"));
        }
    }
}
