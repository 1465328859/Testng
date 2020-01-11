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

public class AddUserTest {
    //加@BeforeTest注解，在用例执行前先获取接口的url
    @BeforeTest(groups = "AddUser",description = "创建用户接口")
    public void beforeTest(){
        //获取接口地址
        TestConfig.addUseruri = configFile.getUrl(InterfaceName.ADDUSER);
        TestConfig.defaultHttpClient = new DefaultHttpClient();
    }
    @Test(groups = "AddUser", description = "创建用户的接口")
    public void AddUser() throws IOException {
        //String a = configFile.getResourceBundle().getString("paramslogin");
        //System.out.println(a);
        Map map =new HashMap();
        map.put("username","testjack20004");
        map.put("password","testjack200");
        map.put("version","1.2.2");
        map.put("platform","2");
        map.put("from","2");
        String responsejosn = new Request().post(TestConfig.addUseruri,map);
        JSONObject jsonObject = JSONObject.fromObject(responsejosn);
        Integer resule = (Integer) jsonObject.get("result");
        if (resule!=1){
            throw new RuntimeException(jsonObject.toString());
        }
        String username = (String) jsonObject.getJSONObject("data").get("username");
        //定义sqlsession对象，从DatabaseUtil类中调getsqlSession方法，直接获取到sqlsession对象，可以执行sql语句，不需要配置数据库信息
        SqlSession sqlSession = DatabaseUtil.getsqlSession();
        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class);
        UsersExample usersExample = new UsersExample();
        usersExample.createCriteria().andUsernameEqualTo(username);
        List<Users> users = mapper.selectByExample(usersExample);
        if (users.size()==1){
            System.out.println("创建成功");
        }else {
            throw new RuntimeException("提交成功，未插入数据库");
        }
    }
}
