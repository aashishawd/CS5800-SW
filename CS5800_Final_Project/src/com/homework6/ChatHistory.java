package com.homework6;/*
ChatHistory: A class that stores the chat history for a user. It should have methods to add a new message to the history and get the last message sent.
*/

import java.util.*;

public class ChatHistory implements IterableByUser {

    private List<Message> messages;

    public ChatHistory() {
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public Message getLastMessage() {
        if (messages.isEmpty()) {
            return null;
        }
        return messages.get(messages.size() - 1);
    }

    public void removeLastMessage() {
        messages.remove(messages.size() - 1);
        if (messages.isEmpty()) {
            messages = null;
        }
        else {
            messages.get(messages.size() - 1);
        }
        
    }
    
    public void getMessages() {
        for (Message message : messages) {
            System.out.println("From: " + message.getSenderNames() + ", To: " + message.getRecipientNames() + ", Timestamp: " + message.getTimestamp() + ", Message: " + message.getContent());
        }
    }
    
    public List<Message> getMessagesList(){
        return messages;
    }
    public void getChatHistory() {
        System.out.println("Chat History:");
        for (Message message : messages) {
            System.out.println("From: " + message.getSenderNames() + ", To: " + message.getRecipientNames() + ", Timestamp: " + message.getTimestamp() + ", Message: " + message.getContent());
        }
    }
    
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        for (Message message : messages) {
            users.add(message.getSender());
            users.addAll(message.getRecipients());
        }
        return users;
    }

    @Override
    public Iterator iterator(User userToSearchWith) {
        return new SearchMessagesByUser(this.getMessagesList(), userToSearchWith);
    }
}