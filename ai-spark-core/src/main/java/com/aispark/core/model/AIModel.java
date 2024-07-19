package com.aispark.core.model;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class AIModel {
    private INDArray model;

    public AIModel() {
        this.model = Nd4j.create(1, 1); // Örnek bir model
    }

    public INDArray predict(INDArray input) {
        // Basit bir tahmin işlevi
        return model.mul(input);
    }
}
