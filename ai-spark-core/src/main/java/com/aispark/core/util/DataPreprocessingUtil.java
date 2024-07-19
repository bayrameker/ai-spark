package com.aispark.core.util;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class DataPreprocessingUtil {

    public static INDArray preprocess(double[] inputData) {
        // Veri ön işleme adımları
        return Nd4j.create(inputData);
    }
}
