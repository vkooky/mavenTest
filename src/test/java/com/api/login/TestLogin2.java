package com.api.login;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import  java.lang.reflect.Method;

public class TestLogin2 {
    //参数化有两种方式 一种通过parameters注解+XML文件里加上<parameter name="username" value="admin"/>
    //            <parameter name="password" value="123"/>

    @Test(dataProvider = "methoddata")
//    @Parameters(value={"username","password"})
    public void testlogin2(String username, String password) {

//        System.out.println("测试登录用例2");
        System.out.println("用户名：" + username + "，密码：" + password);

    }


    @Test(dataProvider = "methoddata")
    public void testlogin3(String username, String password) {
        System.out.println("用户名：" + username + "，密码：" + password);
    }


    @DataProvider
    public Object[][] getData() {
        Object[][] data = {
                {"张三", "123"},
                {"李四", "123"},
                {"王五", "123"}
        };
        return data;
    }

    @DataProvider(name = "methoddata")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("testlogin2")) {
            result = new Object[][]{
                    {"张三", "123"},
                    {"李四", "123"}
            };
        } else if (method.getName().equals("testlogin3")) {
            result = new Object[][]{

                    {"王五", "123"}
            };

        }
        return result;
    }

}

