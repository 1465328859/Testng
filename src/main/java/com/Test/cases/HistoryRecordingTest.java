package com.Test.cases;

import com.Test.config.TestConfig;
import com.Test.model.DBmodel.Lottery;
import com.Test.model.DBmodel.LotteryExample;
import com.Test.model.DBmodel.LotteryMapper;
import com.Test.model.mymodel.InterfaceName;
import com.Test.utils.DatabaseUtil;
import com.Test.utils.Request;
import com.Test.utils.configFile;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HistoryRecordingTest {
    //加@BeforeTest注解，在用例执行前先获取接口的url
    @BeforeTest(groups = "HistoryRecording",description = "历史开奖接口")
    public void beforeTest(){
        //获取接口地址
        TestConfig.HistoryRecordingurl = configFile.getUrl(InterfaceName.HistoryRecording);
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
        String responsejosn = new Request().post(TestConfig.HistoryRecordingurl, map);
        JSONObject jsonObject = JSONObject.fromObject(responsejosn);
        JSONArray array = JSONArray.fromObject(jsonObject.getJSONObject("data").get("list"));
        int size = array.size();
        SqlSession sqlSession = DatabaseUtil.getsqlSession();
        LotteryMapper mapper = sqlSession.getMapper(LotteryMapper.class);
        LotteryExample lotteryExample = new LotteryExample();
        LotteryExample.Criteria criteria = lotteryExample.createCriteria().andIsEnabledEqualTo(1);
        List<Lottery> lotteries = mapper.selectByExample(lotteryExample);
        Integer resule = (Integer) jsonObject.get("result");
        if (resule != 1) {
            throw new RuntimeException(jsonObject.toString());
        } else {
            System.out.println(jsonObject.get("msg"));
        }

    }
}
