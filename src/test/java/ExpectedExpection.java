import org.testng.annotations.Test;

public class ExpectedExpection {
    @Test(expectedExceptions =RuntimeException.class)
    public void runTimeExpectionSuccess(){
        System.out.println("这是一个异常测试");
        throw new RuntimeException();
    }
}
