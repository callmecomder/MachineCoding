# 📩 Messaging Service
A simple and robust messaging application written in Java. This service supports one-on-one messaging and group messaging, with features for message validation, 
secure storage, and easy retrieval for recipients.

## 🌟 Features
1. Send Individual Messages
      Send messages to specific users with built-in phone number validation.

2. Send Group Messages
      Easily broadcast messages to multiple recipients simultaneously.

3. Retrieve Received Messages
      Allows users to fetch all messages sent to them, organized with timestamps.


## 📁 Project Structure
1. MessagingService : 
    Handles core functionalities for sending individual or group messages and retrieving received messages.

2. Data Transfer Objects (DTOs) : 
    SendMessageDto ->
      For single-message operations, includes sender/receiver phone numbers and message content.
    SendMessageInGroup -> 
      Extends SendMessageDto to support group messaging by holding a list of recipient phone numbers.
3. Models : 
    SendMessage ->
      Represents a sent message with details like sender, receiver, message content, and timestamp.
    ReceiveMessage ->
      Represents a received message, displaying sender details and message timestamp.

## 🚀 Getting Started

  Prerequisites
  
    1. Java (version 8 or above)
    2. Maven for dependency management
    
## ⚠️ Error Handling

  1. Phone Number Validation
      Both sender and receiver phone numbers must be 10 digits; otherwise, an exception is thrown.

  2. Thread Safety
      Uses ConcurrentHashMap to ensure safe, concurrent access and management of messages.

## 📈 Future Enhancements
  1. Database Integration
      Add a persistence layer to store messages permanently.

  2. User Authentication
      Introduce user authentication for enhanced security.

  3. Advanced Error Messages
      Implement detailed exception handling for easier debugging.

