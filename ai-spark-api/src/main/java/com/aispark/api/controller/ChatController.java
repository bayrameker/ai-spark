package com.aispark.api.controller;

import com.aispark.api.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping("/process")
    public String processChat(@RequestBody String input) {
        return chatService.processChat(input);
    }
}
