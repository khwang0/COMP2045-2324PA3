package bot;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.entities.channel.ChannelType;

import java.util.ArrayList;
import java.util.List;

import tools.*;

/**
 * This class is done for you. You cannot change this file.
 *
 * This bot handle text messages (i.e. messages that are not commands).
 * This bot does not handle message sent from another bot.
 * 
 * The way this bot to handle message is by using the MessageListener objects.
 * This bot will keep a list of MessageListener objects. Each time a message is received,
 * this bot will call the onMessageReceived method of each MessageListener object.
 * 
 * Each MessageListener object will return a reply message. If the reply message is not null,
 * this bot will send the reply message to the channel where the message is received.
 * 
 */
public final class TextBot extends AbstractBot {
    
    private List <MessageListener> listeners = new ArrayList<>();

    /**
     * To register a MessageListener object to this bot.
     */
    public final void addListener (MessageListener listener) {
        listeners.add(listener);
    }


    /**
     * To simply log that this bot is running.
     */
    @Override
    public void actionPerform() {
        System.out.println("Print Log: TextBot is running.");
    }


    /**
     * You don't call and change this method.
     * 
     * This method is written for you. You cannot modify this method. 
     * You are not suppose to understand the details and usage of this method.
     */
    @Override
    public final void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot())
            return;
        Message message = new Message(event.getAuthor().getName(), event.getAuthor().getId(),
                event.getMessage().getContentRaw(), event.isFromType(ChannelType.PRIVATE));


        for (MessageListener i : listeners) {
            if (i == null)
                continue;
            String reply = i.onMessageReceived(message);
            if (reply != null) {
                event.getChannel().sendMessage(reply).queue();
            }
        }
    }
}
