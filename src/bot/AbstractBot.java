package bot;

import net.dv8tion.jda.api.hooks.ListenerAdapter;


/**
 * This class is done for you. You cannot change this file.
 *
 * The AbstractBot class shows the abstraction of all bots.
 * Bot should be able to perform some actions.
 * 
 * This class inherit from ListenerAdapter class, which is a part of JDA library.
 * In this assignment, you don't need to worry about the details of JDA library.
 * 
 */
public abstract class AbstractBot extends ListenerAdapter {
    /**
     * This method is used to perform some actions.
     */
    public abstract void actionPerform();
}
