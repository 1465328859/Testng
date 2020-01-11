package com.Test.cases;

import com.Test.config.TestConfig;
import com.Test.model.DBmodel.Users;
import com.Test.model.DBmodel.UsersExample;
import com.Test.model.DBmodel.UsersMapper;
import com.Test.model.mymodel.InterfaceName;
import com.Test.utils.DatabaseUtil;
import com.Test.utils.Request;
import com.Test.utils.configFile;
import net.sf.json.JSONObject;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginTest {

    //加@BeforeTest注解，在用例执行前先获取接口的url
    @BeforeTest(groups = "LoginTrue",description = "登录接口")
    public void beforeTest(){
        //获取接口地址
        TestConfig.loginuri = configFile.getUrl(InterfaceName.LOGIN);
        TestConfig.defaultHttpClient = new DefaultHttpClient();
    }
    @Test(groups = "LoginTrue", description = "登录成功的接口")
    public void LoginTrue() throws IOException {
        //String a = configFile.getResourceBundle().getString("paramslogin");
        //System.out.println(a);
        Map map =new HashMap();
        map.put("username","testjack01");
        map.put("password","testjack02");
        map.put("version","1.2.2");
        map.put("platform","2");
        map.put("from","2");
        String responsejosn = new Request().post(TestConfig.loginuri,map);
        JSONObject jsonObject = JSONObject.fromObject(responsejosn);
        Integer resule = (Integer) jsonObject.get("timestamp");
        //定义sqlsession对象，从DatabaseUtil类中调getsqlSession方法，直接获取到sqlsession对象，可以执行sql语句，不需要配置数据库信息
        SqlSession sqlSession = DatabaseUtil.getsqlSession();
        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class);
        UsersExample usersExample = new UsersExample();
        usersExample.createCriteria().andUsernameEqualTo("testjack01");
        List<Users> users = mapper.selectByExample(usersExample);
        if (users.get(0).getLastLogin().equals(resule)){
            System.out.println("登录成功");
        }else {
            throw new RuntimeException(jsonObject.toString());
        }
    }
}
