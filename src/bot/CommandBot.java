package bot;

import net.dv8tion.jda.api.entities.channel.ChannelType;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

import net.dv8tion.jda.api.interactions.commands.build.*;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;


import java.util.ArrayList;
import java.util.List;

import tools.*;

/**
 * This class is done for you. You cannot change this file.
 *
 * A CommandBot handle discord commands (conversation from user that starts with the symbol '/').
 * All bot that handle commands should inherit from this class.
 */
public abstract class CommandBot extends AbstractBot {
    /**
     * To store the options avaliable for the command. The options can only be text options.
     */
    protected List<OptionData> options = new ArrayList<OptionData>();
    private boolean ephemeral;

    /**
     * This method is used to respond to a command.
     */
    protected abstract String respond(Command command);
    /**
     * What command that this bot is listening to.
     */
    protected abstract String getCommand();
    /**
     * The short description for this command.
     */
    protected abstract String getCommandHelp();

    /**
     * The constructor of the CommandBot class.
     */
    public CommandBot() {
        this.ephemeral = false;
    }

    /**
     * To convert the options from the discord format to the format that we use in this program.
     */
    private static List<TextPair> convertOptions(List<OptionMapping> options) {
        List<TextPair> result = new ArrayList<TextPair>();
        for (OptionMapping o : options) {
            result.add(new TextPair(o.getName(), o.getAsString()));
        }
        return result;
    }

    /**
     * You don't call and change this method.
     * 
     * This method is written for you. You cannot modify this method. 
     * You are not suppose to understand the details and usage of this method.
     */
    @Override  
    public final void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getUser().isBot()) return;
        if (event.getName().equals(getCommand())) {
            Command command = new Command(event.getUser().getGlobalName(), event.getUser().getId(), event.getCommandString(), event.getChannel().getType().equals(ChannelType.PRIVATE));
            for (OptionMapping o : event.getOptions()) {
                command.addOption(o.getName(), o.getAsString());
            }            
            String replyMessage = respond(command);
            event.reply(replyMessage).setEphemeral(true).queue();
        }
    }


    /**
     * To include an option for the command. An option, for example, /regcode 123456, the 123456 is an option.
     * 
     * @param optionName The name of the option.
     * @param optionDescription The description of the option.
     * @param isRequired Whether this option is required.
     * 
     */
    public final void addOption(String optionName, String optionDescription, boolean isRequired) {
        options.add(new OptionData(OptionType.STRING, optionName, optionDescription, isRequired));
    }


    /**
     * You don't call and change this method.
     * 
     * This method is written for you. You cannot modify this method. 
     * You are not suppose to understand the details and usage of this method.
     */
    
    public final CommandData getCommands() {
        SlashCommandData c = Commands.slash(getCommand(), getCommandHelp());
        for (OptionData o : options) {
            c.addOption(o.getType(), o.getName(), o.getDescription(), o.isRequired());
        }
        return c;
    }
}
