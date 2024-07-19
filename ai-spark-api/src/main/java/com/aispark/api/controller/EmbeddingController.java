package com.aispark.api.controller;

import com.aispark.api.service.EmbeddingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/embedding")
public class EmbeddingController {

    @Autowired
    private EmbeddingService embeddingService;

    @PostMapping("/process")
    public String processEmbedding(@RequestBody String input) {
        return embeddingService.processEmbedding(input);
    }
}
