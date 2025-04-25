package com.demp.mcp.client;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2025/4/25
 *
 * @author yanqi
 * @version 1.0
 */
@RestController
public class AgentController {

    private final ChatClient chatClient;

    public AgentController(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @GetMapping(value = "/api", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public String api(@RequestParam String prompt) {
        return chatClient.prompt(prompt)
                .advisors(new SimpleLoggerAdvisor())
                .call().content();
    }


}
