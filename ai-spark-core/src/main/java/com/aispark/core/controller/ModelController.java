package com.aispark.core.controller;

import com.aispark.core.service.ModelTrainingService;
import com.aispark.core.service.PredictionService;
import com.aispark.core.model.TrainingRequest;
import com.aispark.core.model.PredictionRequest;
import com.aispark.core.model.PredictionResponse;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/model")
public class ModelController {

    @Autowired
    private ModelTrainingService modelTrainingService;

    @Autowired
    private PredictionService predictionService;

    @PostMapping("/train")
    public ResponseEntity<String> trainModel(@RequestBody TrainingRequest request) {
        modelTrainingService.trainModel(request.getModelType(), request.getTrainingData());
        return ResponseEntity.ok("Model training started");
    }

    @PostMapping("/predict")
    public ResponseEntity<PredictionResponse> predict(@RequestBody PredictionRequest request) {
        INDArray prediction = predictionService.predict(request.getModelId(), request.getInputData());
        return ResponseEntity.ok(new PredictionResponse(prediction));
    }
}