package net.houdaifa.ebankbot.controllers;

import net.houdaifa.ebankbot.agents.EbankAIAgent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EbankChatbotController {
    private EbankAIAgent ebankAIAgent;

    public EbankChatbotController(EbankAIAgent ebankAIAgent){
        this.ebankAIAgent = ebankAIAgent;
    }

    @GetMapping("/chat")
    public String chat(
            @RequestParam(name = "query") String query,
            @RequestParam(name = "conversationId", defaultValue = "default") String conversationId) {

        return ebankAIAgent.chat(query, conversationId);
    }
}
