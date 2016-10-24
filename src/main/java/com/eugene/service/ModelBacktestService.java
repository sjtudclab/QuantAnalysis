package com.eugene.service;

import com.eugene.model.*;

/**
 * Created by eugene on 16/7/11.
 */
public interface ModelBacktestService {

    DaySvmModelBacktestResult doDaySvmModelBacktest(DaySvmModelBacktestParameters paras);

    MABacktestResult doMABacktest(MABacktestParameters paras);

    HurstModelResult doHurstModel(HurstModelParameters paras);

}
