package com.aispark.api.controller;

import com.aispark.api.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/document")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @PostMapping("/process")
    public String processDocument(@RequestBody String input) {
        return documentService.processDocument(input);
    }
}
