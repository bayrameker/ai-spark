package com.aispark.core.service;

import com.aispark.core.model.AIModel;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PredictionService {

    @Autowired
    private AIModel aiModel;

    public INDArray predict(String modelId, double[] inputData) {
        // modelId ve inputData kullanılarak tahmin işlemi gerçekleştirilir
        INDArray input = DataPreprocessingUtil.preprocess(inputData);
        return aiModel.predict(input);
    }
}
