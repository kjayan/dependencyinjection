import com.java.learn.di.noframework.exceptions.MessageServiceException;
import com.java.learn.di.noframework.services.client.Client;
import com.java.learn.di.noframework.services.client.impl.MyDIAppClientImpl;
import com.java.learn.di.noframework.services.injector.MessageServiceInjector;
import com.java.learn.di.noframework.services.message.MessageService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public class MyDIClientTest {

    private MessageServiceInjector injector = null;

    @Before
    public void setup(){
        injector = new MessageServiceInjector() {
            public Client getClient() {
                return new MyDIAppClientImpl(new MessageService() {
                    public void sendMessage(String message, String recipientAddress) throws MessageServiceException {
                        System.out.println("Mock message service implementation");
                    }
                });
            }
        };
    }

    @Test
    public void test(){
        Client client = injector.getClient();
        try {
            client.processMessage("Hello World", "helloworld@internet.com");
        }catch (Exception e){
            System.err.println("Exception :"+e.getMessage());
        }
    }

    @After
    public void tear(){
        injector = null;
    }
}
