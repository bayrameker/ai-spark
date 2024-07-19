package com.aispark.core.service;

import com.aispark.core.model.AIModel;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelTrainingService {

    @Autowired
    private AIModel aiModel;

    public void trainModel(String modelType, String trainingData) {
        // Model eğitimi için gerekli adımlar
        // modelType ve trainingData kullanılarak model eğitimi gerçekleştirilir
    }
}
