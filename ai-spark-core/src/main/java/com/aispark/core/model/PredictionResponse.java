package com.aispark.core.model;

import org.nd4j.linalg.api.ndarray.INDArray;

public class PredictionResponse {
    private INDArray prediction;

    public PredictionResponse(INDArray prediction) {
        this.prediction = prediction;
    }

    public INDArray getPrediction() {
        return prediction;
    }

    public void setPrediction(INDArray prediction) {
        this.prediction = prediction;
    }
}
