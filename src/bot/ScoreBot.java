package bot;

import java.util.Scanner;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import tools.*;

/**
 * This bot handle the command '/score'.
 * When a user ask about his score, this bot will check the score of the user and return the score.
 * To know which student ID that the user has been registered, this bot will ask the UserManagementBot.
 * Prior to using this bot, you need to register this bot to the UserManagementBot using the command '/registration'.
 * 
 */
public class ScoreBot extends CommandBot {
    public static final String DEFAULT_FILE = "dictation.csv";
    //TODO: Add your private data member here

    /**
     * The constructor of the bot, require a UserManagementBot object.
     * Since the filename of the score is not given, the default file name is used.
     */
    public ScoreBot(UserManagementBot r) {
        //TODO
    }
    /**
     * The constructor of the bot, require a UserManagementBot object and the filename of the score.
     */
    public ScoreBot(UserManagementBot r, String filename) {
        //TODO
    }
    /**
     * Which score that the object is listening to.
     */
    @Override
    public String getCommand() {
        //TODO
    }
    /**
     * The short description for this command.
     */
    @Override
    public String getCommandHelp() {
        //TODO
    }
    /**
     * This method is used to respond to a command.
     */
    @Override
    public String respond(Command command) {
        //TODO
    }
    /**
     * Print the last user who queried the score bot service to console.
     */
    @Override
    public void actionPerform() {
        //TODO
    }
}
