import com.java.learn.di.noframework.client.MyClient;
import com.java.learn.di.noframework.client.impl.MyClientImpl;
import com.java.learn.di.noframework.injector.MessageServiceInjector;
import com.java.learn.di.services.messages.MessageService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public class MyClientWithoutDITest {

    private MessageServiceInjector injector = null;

    @Before
    public void setup(){
        injector = new MessageServiceInjector() {
            public MyClient getClient() {
                return new MyClientImpl(new MessageService() {
                    public void sendMessage(String message, String recipientAddress){
                        System.out.println("Mock message service implementation");
                    }
                });
            }
        };
    }

    @Test
    public void test(){
        MyClient myClient = injector.getClient();
        try {
            myClient.processMessage("Hello World", "helloworld@internet.com");
        }catch (Exception e){
            System.err.println("Exception :"+e.getMessage());
        }
    }

    @After
    public void tear(){
        injector = null;
    }
}
