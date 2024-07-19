package com.aispark.core.model;

public class PredictionRequest {
    private String modelId;
    private double[] inputData;

    // Getter ve Setter metodları
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public double[] getInputData() {
        return inputData;
    }

    public void setInputData(double[] inputData) {
        this.inputData = inputData;
    }
}
