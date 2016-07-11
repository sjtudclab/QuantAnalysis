package com.eugene.service;

import com.eugene.model.ModelBacktestParameters;
import com.eugene.model.ModelBacktestResult;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by eugene on 16/7/11.
 */
@Service
public class ModelBacktestServiceImpl implements ModelBacktestService {

    private static final String PY_PATH = "/Users/eugene/anaconda/bin/python";
    private static final String PY_FILE_PATH = "/Users/eugene/ProgramData/PyStudy/finance/module/Days.py";
    private static final String BASE_PATH = "/Users/eugene/Downloads/data/";

    @Override
    public ModelBacktestResult doModelBacktest(ModelBacktestParameters paras) {
        ModelBacktestResult res = new ModelBacktestResult();
        try {
            Process p = Runtime.getRuntime().exec(PY_PATH+" "+PY_FILE_PATH+" "+BASE_PATH
                    +" "+paras.getInstrument()+" "+paras.getInitCapital()+" "
                    +paras.getStartYear()+" "+paras.getYearNum()+" "
                    +paras.getWinDays()+" "+paras.getWin());

            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            in.readLine();
            res.setDates(in.readLine());
            res.setClose(in.readLine());
            res.setBuys(in.readLine());
            res.setSells(in.readLine());
            res.setActionDates(in.readLine());
            res.setPortfolios(in.readLine());
            res.setAccuracy(Double.valueOf(in.readLine()));
            res.setTotalValue(Double.valueOf(in.readLine()));
            res.setTotalReturn(Double.valueOf(in.readLine()));
            res.setAnnualizedReturn(Double.valueOf(in.readLine()));
            p.waitFor();
            in.close();
            if(p.exitValue()!=0) return null;
            else return res;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static final String INSTRUMENT = "000300.SH";
    private static final long INIT_CAPITAL = 100000000;
    private static final int START_YEAR = 2014;
    private static final int YEAR_NUM = 2;
    private static final int WIN_DAYS = 15;
    private static final int WIN = 9;

}
