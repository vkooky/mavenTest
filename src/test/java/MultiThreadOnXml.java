import org.testng.annotations.Test;

public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.printf("Thread ID:%s%n",Thread.currentThread().getId());
    }
}
