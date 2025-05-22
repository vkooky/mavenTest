import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.*;

public class TestApi {
    //发送一个get请求并且返回日志
    @Test
    public void test(){
        Response res=given().
//                queryParam("phone","1234567").
//                queryParam("password","123456").
        when().
                get("https://km.sankuai.com/api/collaboration/content/2711812734/querystep?tenantCode=CITADEL&stepVersion=1119&limit=5000&subjectType=0").
        then().
                extract().response();

        System.out.println(res.statusCode());
        System.out.println(res.getHeaders());
    }

//
//    //post分为表单参数和json参数---表单
//    @Test
//    public void test2() {
//        given().
//                //请求头--内容的类型--表单
//                contentType("application/x-www-form-urlencoded").
//                //通过body传表单参数
//                body("name=vkooky").
//        when().
//                post("https://www.baidu.com/").
//        then().
//                log().body();
//    }
//
//
//    //post分为表单参数和json参数----json
//    @Test
//    public void test3(){
//        given().
//                //请求头--内容的类型--json
//                contentType("application/json").
//                //通过body传json参数
//                body("{\"phone\":\"123456\",\"pwd\":\"123\"}").
//        when().
//                post("https://www.baidu.com/").
//        then().
//                log().body();
//        }
//
//
//    //文件上传
//    @Test
//    public void test4(){
//        given().
//                //请求头--内容的类型---文件
//                contentType("multipart/form-data").
//                //通过body传json参数
//                multiPart(new File("")).
//        when().
//                post("https://www.baidu.com/").
//        then().
//                log().body();
//    }

}
