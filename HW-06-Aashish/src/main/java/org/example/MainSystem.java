package org.example;

import java.util.Iterator;
import java.util.List;

public class MainSystem {
    private static final ChatServer chatServer = new ChatServer();

    public static void main(String[] args) {
        //creating 4 users and adding them to system
        User roomfrnd1 = new User("Aashish Awadhani", chatServer);
        User roomfrnd2 = new User("John Paul", chatServer);
        User roomfrnd3 = new User("Steve Porter", chatServer);
        User roomfrnd4 = new User("Steffeny Johnson", chatServer);
        System.out.println("\n===== User's Created =====");


        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        chatServer.sendMessage(new Message(roomfrnd1, List.of(roomfrnd2), "Hey, Aashish! What are we having for dinner tonight!"));
        chatServer.sendMessage(new Message(roomfrnd4, List.of(roomfrnd2), "Hi Steffeny, How is your headache now?!"));
        chatServer.sendMessage(new Message(roomfrnd2, List.of(roomfrnd4), "Hey John, Thanks for asking, but it's only gotten worse. "));
        chatServer.sendMessage(new Message(roomfrnd4, List.of(roomfrnd1), "Steffeny, Thanks for not asking me what I want to eat. "));
        chatServer.sendMessage(new Message(roomfrnd1, List.of(roomfrnd3), "Hi Aashish, Will you eat chicken today or are you still not having non-veg?!"));
        chatServer.sendMessage(new Message(roomfrnd1, List.of(roomfrnd4), "I'm so sorry Aashish, what do you want to eat? "));
        chatServer.sendMessage(new Message(roomfrnd3, List.of(roomfrnd1), "Hello, Steve, I will not be eating non-veg so I cannot eat chicken."));
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("\n===== Demonstrating block function =====");
        roomfrnd2.blockerUsers(roomfrnd1);
        System.out.println("----------------------------------");
        chatServer.sendMessage(new Message(roomfrnd1, List.of(roomfrnd2, roomfrnd3), "Steve, I want to go to cheesecake factory!"));
        System.out.println("----------------------------------");
        chatServer.sendMessage(new Message(roomfrnd3, List.of(roomfrnd1), "Why cheesecake factory, Aashish?"));
        System.out.println("----------------------------------");
        System.out.println("\n===== Demonstrating unsent function =====");
        System.out.println("Steve Porter unsent last message");
        chatServer.undoLastMessage(roomfrnd3);
        System.out.printf("Now, Steve Porter's last message is '%s'\n", roomfrnd3.getChatHistory().getLastSentMessages());
        System.out.println("----------------------------------");
        System.out.println("\n===== Demonstrating unsent function =====");
        System.out.println("John Pauls unsent last message:");
        chatServer.undoLastMessage(roomfrnd2);
        System.out.println("----------------------------------");
        // Trying iterating over all messages in user3's chat history
        System.out.println("Iterating over all messages in Steve Porter's chat history:");
        Iterator<Message> allMessagesIterator = roomfrnd3.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }
        System.out.printf("------------------------------------\n");
        // Trying iterating over all messages in user1's chat history
        System.out.println("Iterating over all messages in Aashish Awadhani's chat history:");
        allMessagesIterator = roomfrnd1.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }
        System.out.printf("------------------------------------\n");
        // Trying iterating over all messages in user4's chat history
        System.out.println("Iterating over all messages in John Paul's chat history:");
        allMessagesIterator = roomfrnd4.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }
        System.out.printf("------------------------------------\n");
        chatServer.unregisterUser(roomfrnd1);
        chatServer.sendMessage(new Message(roomfrnd3, List.of(roomfrnd1), "Because I want to have the cheesecakes from there."));
    }
}

