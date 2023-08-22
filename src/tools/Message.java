package tools;



/**
 * This class is to store the message that is sent by the user.
 * 
 * A message has a sender name, a sender ID, a message content,
 * and a boolean to indicate whether the message is a private message.
 * 
 * This class should have suitable constructor and getter methods.
 * 
 * All variables should be private and do not change after the object is created.
 */
public class Message {
    //TODO - add other data members and methods

    /**
     * Constructor of the Message class. Given. 
     */
    public Message(String name, String id, String content, boolean isPrivate) {
        this.name = name;
        this.id = id;
        this.content = content;
        this.isPrivate = isPrivate;
    }
}
