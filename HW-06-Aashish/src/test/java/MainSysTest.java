import java.util.List;
import org.example.ChatServer;
import org.example.User;
import org.example.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainSysTest {
    private ChatServer chatServer;
    private User user1, user2, user3, user4;

    @BeforeEach
    void setUp() {
        chatServer = new ChatServer();
        user1 = new User("Shreyas Chaudhary", chatServer);
        user2 = new User("Stanley Hudson", chatServer);
        user3 = new User("Bruno Fernandes", chatServer);
        user4 = new User("Dwight Shrute", chatServer);
    }

//    @Test
//    void testSendMessage() {
//        chatServer.sendMessage(new Message(user1, List.of(user2), "Hey!"));
//        assertEquals("Hey!", user2.getChatHistory().getLastSentMessages().getTextMessage());
//    }
//
//    @Test
//    void testReceiveMessage() {
//        chatServer.sendMessage(new Message(user1, List.of(user2), "Hey!"));
//        Message lastReceivedMessage = user2.getChatHistory().getLastSentMessages();
//        assertNotNull(lastReceivedMessage);
//        assertEquals("Hey!", lastReceivedMessage.getTextMessage());
//    }

    @Test
    void testUserBlocking() {
        user1.blockerUsers(user2);
        assertTrue(user1.getBlockedUsers().contains(user2));
    }

    @Test
    void testMessageUndo() {
        chatServer.sendMessage(new Message(user3, List.of(user1), "Message to be undone"));
        int originalNumOfMessages = user3.getChatHistory().getSentMessages().size();
        chatServer.undoLastMessage(user3);
        assertEquals(originalNumOfMessages - 1, user3.getChatHistory().getSentMessages().size());
    }

    @Test
    void testUserRegistration() {
        assertTrue(chatServer.getUsers().contains(user1));
        assertTrue(chatServer.getUsers().contains(user2));
        assertTrue(chatServer.getUsers().contains(user3));
        assertTrue(chatServer.getUsers().contains(user4));
    }

    @Test
    void testUnregisterUser() {
        chatServer.unregisterUser(user4);
        assertFalse(chatServer.getUsers().contains(user4));
    }


}
