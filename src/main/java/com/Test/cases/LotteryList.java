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
import java.util.Iterator;
import java.util.List;

public class LotteryList {
    static JSONArray array;
    @BeforeTest(groups = "LotteryList",description = "奖期接口")
    public void beforetest(){
        TestConfig.LotteryListuri = configFile.getUrl(InterfaceName.LotteryList);
        TestConfig.defaultHttpClient = new DefaultHttpClient();
    }

    @Test(groups = "LotteryList",description = "奖期接口")
    public void LotteryList() throws IOException {
        String post = new Request().post(TestConfig.LotteryListuri, "{\"abcd\":\"this is an no use param\",\"platform\":\"1\",\"from\":\"2\",\"token\":\"1234\",\"version\":\"3.0\",\"timestamp\":1579057069}");
        JSONObject jsonObject = JSONObject.fromObject(post);
        array = JSONArray.fromObject(jsonObject.get("data"));
        array.remove(0);
        Iterator iterator = array.iterator();
        int count=0;
        while (iterator.hasNext()){
            JSONArray list = JSONObject.fromObject(iterator.next()).getJSONArray("list");
            Iterator iterator1 = list.iterator();
            while (iterator1.hasNext()){
                iterator1.next();
                count++;
            }
        }
        SqlSession sqlSession = DatabaseUtil.getsqlSession();
        LotteryMapper mapper = sqlSession.getMapper(LotteryMapper.class);
        LotteryExample lotteryExample = new LotteryExample();
        lotteryExample.createCriteria().andIsEnabledEqualTo(1);
        List<Lottery> lotteries = mapper.selectByExample(lotteryExample);
        if (lotteries.size()==count){
            System.out.println("投注列表获取正确");
        }else {
            throw new RuntimeException(jsonObject.toString());
        }

    }
}
