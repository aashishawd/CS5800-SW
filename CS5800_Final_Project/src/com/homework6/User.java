package com.homework6;

import java.util.*;

public class User implements IterableByUser{
    private String name;
    private ChatServer server;
    private ChatHistory chatHistory;

    public User(String name, ChatServer server) {
        this.name = name;
        this.server = server;
        this.chatHistory = new ChatHistory();
    }

    public String send(User user, String content) {
        List<User> recipients = new ArrayList<User>();
        recipients.add(user);
        User sender = this;
        Message message = new Message(sender, recipients, content);
        chatHistory.addMessage(message);
        server.sendMessage(message.getSender(),message.getRecipients(),message.getContent());
        return content;
    }

    public String receive(Message message) {
        if (chatHistory.getLastMessage() != message) {
            chatHistory.addMessage(message);
            System.out.printf("[%s] Received message from %s: %s%n", name, message.getSender(), message.getContent());
        }
        return name;
    }

    public void undo(User user) {
        Message lastMessage = chatHistory.getLastMessage();
        if (lastMessage != null) {
            chatHistory.removeLastMessage();
            server.undoLastMessage(user);
        }
    }

    public void block(User user) {
        server.blockUser(this, user);
    }

    public void unblock(User user) {
        server.unblockUser(this, user);
    }

    public String getName() {
        return name;
    }
    public ChatServer getServer() {
        return server;
    }
    public void registerUser(User user){
        server.registerUser(user);
    }
    public void unregisterUser(User user){
        server.unregisterUser(user);
    }

    public void getChatHistory() {
        chatHistory.getChatHistory();
    }

    private List<Message> messages2;
    public User(String name) {
        this.name = name;
        this.messages2 = new ArrayList<>();
    }

    public void addMessage(Message message) {
        this.messages2.add(message);
    }

    public List<Message> getMessages() {
        return this.messages2;
    }
    @Override
    public Iterator iterator(User userToSearchWith) {
        return new SearchMessagesByUser(this.getMessages(), userToSearchWith);
    }
}