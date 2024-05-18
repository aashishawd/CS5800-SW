package com.homework6;/*
MessageMemento: A class that represents a snapshot of a message sent by a user. It should have properties for the message content and timestamp.
*/
import java.time.LocalDateTime;

class MessageMemento {
   private String messageContent;
   private LocalDateTime timestamp;

   public MessageMemento(String messageContent, LocalDateTime timestamp2) {
       this.messageContent = messageContent;
       this.timestamp = timestamp2;
   }

   public String getMessageContent() {
       return messageContent;
   }

   public LocalDateTime getTimestamp() {
       return timestamp;
   }
}