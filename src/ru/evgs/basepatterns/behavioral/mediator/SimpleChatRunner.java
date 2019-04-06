package ru.evgs.basepatterns.behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "Bob");
        User user2 = new SimpleUser(chat, "Alisa");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello, I am Bob");
        user2.sendMessage("Hi, my name is Alisa! Let's do some cryptography");
        admin.sendMessage("Roger that. I am your god");
    }
}
