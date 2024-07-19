package com.aispark.core.model;

public class TrainingRequest {
    private String modelType;
    private String trainingData;

    // Getter ve Setter metodları
    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getTrainingData() {
        return trainingData;
    }

    public void setTrainingData(String trainingData) {
        this.trainingData = trainingData;
    }
}
