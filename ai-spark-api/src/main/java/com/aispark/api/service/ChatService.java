package com.aispark.api.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {
    public String processChat(String input) {
        // Chat işleme mantığı
        return "Processed: " + input;
    }
}
