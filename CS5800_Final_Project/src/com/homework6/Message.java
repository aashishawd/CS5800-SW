package com.homework6;

import java.time.LocalDateTime;
import java.util.*;

public class Message {
    private User sender;
    private List<User> recipients;
    private LocalDateTime timestamp;
    private String content;

    public Message(User sender, List<User> recipients, String content) {
        this.sender = sender;
        this.recipients = recipients;
        this.timestamp = LocalDateTime.now();
        this.content = content;
    }

    public User getSender() {
        return sender;
    }

    public String getSenderNames() {
        User sender = this.sender;
        return sender.getName();
    }
    public List<User> getRecipients() {
        return recipients;
    }

    public String getRecipientNames() {
        StringBuilder builder = new StringBuilder();
        for (User recipient : recipients) {
            builder.append(recipient.getName()).append(", ");
        }
        builder.delete(builder.length() - 2, builder.length()); // remove the trailing comma and space
        return builder.toString();
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getContent() {
        return content;
    }

    public MessageMemento createMemento() {
        return new MessageMemento(content, timestamp);
    }

    public void restoreFromMemento(MessageMemento memento) {
        this.content = memento.getMessageContent();
        this.timestamp = memento.getTimestamp();
    }

    public String getId() {
        return String.format("%s-%s", sender, timestamp);
    }

    public MessageMemento saveToMemento(MessageMemento memento) {
        return new MessageMemento(memento.getMessageContent(), memento.getTimestamp());
    }
}
