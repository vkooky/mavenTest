package com.api.login;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLogin2 {

    @Test(dataProvider = "getData")
//    @Parameters(value={"username","password"})
    public void testlogin2(String username,String password){

//        System.out.println("测试登录用例2");
        System.out.println("用户名："+username+"，密码："+password);

    }
    @DataProvider
    public Object[][] getData(){
        Object[][] data={
                {"张三","123"},
                {"李四","123"},
                {"王五","123"}
        };
        return data;
    }
}
