package com.eugene.service;

import com.eugene.model.ModelBacktestParameters;
import com.eugene.model.ModelBacktestResult;

/**
 * Created by eugene on 16/7/11.
 */
public interface ModelBacktestService {

    ModelBacktestResult doModelBacktest(ModelBacktestParameters paras);

}
