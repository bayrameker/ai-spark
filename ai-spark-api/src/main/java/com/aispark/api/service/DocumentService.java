package com.aispark.api.service;

import org.springframework.stereotype.Service;

@Service
public class DocumentService {
    public String processDocument(String input) {
        // Doküman işleme mantığı
        return "Processed Document: " + input;
    }
}
