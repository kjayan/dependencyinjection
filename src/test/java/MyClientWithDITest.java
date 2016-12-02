import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.java.learn.di.withframework.client.MyClient;
import com.java.learn.di.services.messages.MessageService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public class MyClientWithDITest {
    private Injector injector;
    @Before
    public void setup(){
        injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(MessageService.class).to(MockMessageService.class);
            }
        });
    }

    @After
    public void teardown(){
        injector = null;
    }

    @Test
    public void test(){
        MyClient client = injector.getInstance(MyClient.class);
        client.sendMessage("Mock Message","Mockrecipient@address.com");
    }
}
