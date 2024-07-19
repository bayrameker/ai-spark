package com.aispark.core.controller;

import com.aispark.core.service.CoreService;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/core")
public class CoreController {

    @Autowired
    private CoreService coreService;

    @PostMapping("/predict")
    public String predict(@RequestBody double[] inputData) {
        INDArray result = coreService.predict(inputData);
        return result.toString();
    }
}
