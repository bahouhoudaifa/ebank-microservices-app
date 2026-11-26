package net.houdaifa.ebankbot.discord;

import com.zgamelogic.discord.annotations.DiscordMapping;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.houdaifa.ebankbot.agents.EbankAIAgent;
import org.springframework.ai.chat.prompt.Prompt;

public class DiscordBot {
    private EbankAIAgent ebankAIAgent;

    public DiscordBot (EbankAIAgent ebankAIAgent) {
        this.ebankAIAgent = ebankAIAgent;
    }

    @DiscordMapping
    private void perform(MessageReceivedEvent event){
        if (event.getAuthor().isBot()) return;
        String query = event.getMessage().getContentRaw();
        String conversationId = event.getAuthor().getId();
        String response = ebankAIAgent.chat(query, conversationId);
        event.getChannel().sendMessage(response).queue();
    }
}
