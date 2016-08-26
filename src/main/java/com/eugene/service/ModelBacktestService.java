package com.eugene.service;

import com.eugene.model.DaySvmModelBacktestParameters;
import com.eugene.model.DaySvmModelBacktestResult;
import com.eugene.model.MABacktestParameters;
import com.eugene.model.MABacktestResult;

/**
 * Created by eugene on 16/7/11.
 */
public interface ModelBacktestService {

    DaySvmModelBacktestResult doDaySvmModelBacktest(DaySvmModelBacktestParameters paras);

    MABacktestResult doMABacktest(MABacktestParameters paras);

}
