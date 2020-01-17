package com.Test.cases;

import com.Test.config.TestConfig;
import com.Test.model.mymodel.InterfaceName;
import com.Test.utils.Request;
import com.Test.utils.configFile;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.http.impl.client.DefaultHttpClient;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Betting {
    //加@BeforeTest注解，在用例执行前先获取接口的url
    @BeforeTest(groups = "Betting",description = "投注接口")
    public void beforeTest(){
        //获取接口地址
        TestConfig.Bettingurl = configFile.getUrl(InterfaceName.Betting);
        TestConfig.defaultHttpClient = new DefaultHttpClient();
    }
    @Test(groups = "Betting", description = "投注的接口")
    public void Betting() throws IOException {
        String token = LoginTest.token;
        Map map =new HashMap();
        map.put("betting_list","[{\"method_id\":105,\"money\":2,\"total_money\":2,\"code\":\"大\",\"mode\":1}]");
        map.put("is_trace","0");
        map.put("lottery_id","35");
        map.put("version","3.0");
        map.put("platform","1");
        map.put("stop_on_win","0");
        map.put("from","2");
        map.put("token",token);
//        System.out.println(map.get("lottery_id"));
        String json="{\"lottery_id\":"+map.get("lottery_id")+",\"platform\":\"1\",\"from\":\"2\",\"token\":\"1234\",\"version\":\"3.0\",\"timestamp\":1579174635}";
        String post = new Request().postNOurl("http://47.56.70.206:18306/lottery/buyDetails",json );
        JSONObject jsonObject1 = JSONObject.fromObject(post);
        String sale_no = (String) jsonObject1.getJSONObject("data").get("sale_no");
        map.put("issue",sale_no);
        String responsejosn = new Request().post(TestConfig.Bettingurl,map);
        JSONObject jsonObject = JSONObject.fromObject(responsejosn);
        Integer resule = (Integer) jsonObject.get("result");
        if (resule!=1){
            throw new RuntimeException(jsonObject.toString());
        }else {
            System.out.println(jsonObject.get("msg"));
        }
        //定义sqlsession对象，从DatabaseUtil类中调getsqlSession方法，直接获取到sqlsession对象，可以执行sql语句，不需要配置数据库信息
//        SqlSession sqlSession = DatabaseUtil.getsqlSession();
//        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class);
//        UsersExample usersExample = new UsersExample();
//        usersExample.createCriteria().andUsernameEqualTo(username);
//        List<Users> users = mapper.selectByExample(usersExample);
//        if (users.size()==1){
//            System.out.println("创建成功");
//        }else {
//            throw new RuntimeException("提交成功，未插入数据库");
//        }
    }
}
