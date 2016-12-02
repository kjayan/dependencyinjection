import com.java.learn.di.services.messages.MessageService;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public class MockMessageService implements MessageService{
    public void sendMessage(String message, String recipientAddress) {
        System.out.println("Mock message service called with message: "+message+" and recipient: "+recipientAddress);
    }
}
