package com.homework6;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        // create users
        User prakash = new User("Prakash", chatServer); // Alice
        User shivam = new User("Shivam", chatServer); // Bob
        User atri = new User("Atri", chatServer); // Charlie

        // register users
        prakash.registerUser(prakash);
        shivam.registerUser(shivam);
        atri.registerUser(atri);

        // Send messages
        prakash.send(shivam, "Hello Shivam!");
        shivam.send(prakash, "Hi Prakash, how are you?");
        atri.send(prakash, "Hey Prakash, want to grab lunch?");
        prakash.send(atri, "Sure Atri, where do you want to go?");

        // Undo last message
        prakash.undo(prakash);

        // Block messages from specific user
        shivam.block(prakash);

        // Send messages again
        prakash.send(shivam, "Please can you unblock me, Shivam?");
        shivam.send(prakash, "No, sorry Prakash.");

        // Print chat history
        System.out.println("Chat history for Prakash:");
        prakash.getChatHistory();

        System.out.println("Chat history for Shivam:");
        shivam.getChatHistory();

        System.out.println("Chat history for Atri:");
        atri.getChatHistory();

        // Iterable over all messages in the chat history demo
        ChatServer newServer = new ChatServer();
        User dean = new User("Dean", newServer);
        User peggy = new User("Peggy", newServer);
        dean.registerUser(dean);
        peggy.registerUser(peggy);

        // send messages through new server
        dean.send(peggy, "Hi Dean! How are you? Haven't seen you in a while.");
        peggy.send(dean, "I'm good, thanks for asking. How about you?");
        dean.send(peggy, "I'm doing well too, thanks for asking.");
        peggy.send(dean, "Bye! Have a nice day. Love you.");
        List<User> user1 = new ArrayList<>();
        user1.add(dean);
        List<User> user2 = new ArrayList<>();
        user2.add(peggy);

        // add messages to chat history directly
        ChatHistory chatHistory = new ChatHistory();
        chatHistory.addMessage(new Message(dean, user2, "Peggy! OMG! Where have you been?"));
        chatHistory.addMessage(new Message(peggy, user1, "France. Went on a Trip. How about you?"));
        chatHistory.addMessage(new Message(dean, user2, "I'm doing well too, thanks for asking. The new intership has kept me busy."));
        chatHistory.addMessage(new Message(peggy, user1, "You must tell me about your intership. over coffee."));

        // Iterate over all messages in the chat history
        System.out.println("All messages: Iterate over all messages in the chat history");
        for (User usersList : chatHistory.getUsers()) {
            final Iterator<Message> iter = chatHistory.iterator(usersList);
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }
        }

        // Iterate over all messages sent or received by Dean
        System.out.println("Messages sent or received by Dean:");
        dean.getChatHistory();

        // Iterate over all messages sent or received by Peggy
        System.out.println("Messages sent or received by Peggy:");
        peggy.getChatHistory();

        // Iterate over all messages sent or received by Dean and Peggy
        System.out.println("All messages:");
        chatHistory.getMessages();
    }
}
