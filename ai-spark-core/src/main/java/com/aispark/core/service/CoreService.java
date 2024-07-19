package com.aispark.core.service;

import com.aispark.core.model.AIModel;
import com.aispark.core.util.DataPreprocessingUtil;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoreService {
    @Autowired
    private AIModel aiModel;

    public INDArray predict(double[] inputData) {
        INDArray input = DataPreprocessingUtil.preprocess(inputData);
        return aiModel.predict(input);
    }
}
