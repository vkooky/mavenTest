import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class TestApi {
    //发送一个get请求并且返回日志
    @Test
    public void test(){
        given().
                queryParam("phone","1234567").
                queryParam("password","123456").
        when().
                get("https://www.baidu.com/").
        then().
                log().body();


        //post分为表单参数和json参数
    }
}
