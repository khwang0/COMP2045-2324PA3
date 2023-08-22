import bot.*;
import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;



public class MyFirstBot {
    private static final String token = "";
    public static void main(String[] args) {


        JDA jda = JDABuilder.createDefault(token).enableIntents(GatewayIntent.MESSAGE_CONTENT).build();
        CommandListUpdateAction c = jda.updateCommands();

        //After getting started, delete the following lines and enable the code below
        {
            jda.addEventListener(new MyListener());
            return;
        } //getting started


        //real code, uncomment the following lines after getting started
        /*        
        UserManagementBot umBot = new UserManagementBot("users.csv");
        TextBot textBot = new TextBot();
        textBot.addListener(new SeatChecker());
        textBot.addListener(new PingMessageListener());
        AbstractBot[] bots = new AbstractBot[] {
            textBot, umBot, new ScoreBot(umBot), new WhoAmIBot(umBot)
        };


        for (AbstractBot b : bots) {
            jda.addEventListener(b);
            if (b != null && b instanceof CommandBot)
                c.addCommands(((CommandBot)b).getCommands());
        }
        c.queue();

        new Thread(() -> {
            while (true)
                try {
                    Thread.sleep(10000);
                    for (AbstractBot b : bots)
                        b.actionPerform();
                } catch (InterruptedException e) {
                    System.err.println(e);
                }
        }).start();
    */
    }

}


class MyListener extends AbstractBot {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        event.getChannel().sendMessage("Hello World!").queue();
    }
    @Override
    public void actionPerform() {
    }
}