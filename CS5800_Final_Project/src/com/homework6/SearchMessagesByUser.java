package com.homework6;

import java.util.*;

public class SearchMessagesByUser implements Iterator<Message> {
    private List<Message> messages;
    private User userToSearchWith;
    private int index;

    public SearchMessagesByUser(List<Message> messages, User userToSearchWith) {
        this.messages = messages;
        this.userToSearchWith = userToSearchWith;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        while (index < messages.size()) {
            Message message = messages.get(index);
            if (message.getSender().equals(userToSearchWith) || message.getRecipients().equals(userToSearchWith)) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Message next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Message message = messages.get(index);
        index++;
        return message;
    }
}
