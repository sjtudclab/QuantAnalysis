package com.eugene.service;

import com.eugene.exception.ErrorCode;
import com.eugene.exception.RestException;
import com.eugene.model.DaySvmModelBacktestParameters;
import com.eugene.model.DaySvmModelBacktestResult;
import com.eugene.model.MABacktestParameters;
import com.eugene.model.MABacktestResult;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by eugene on 16/7/11.
 */
@Service
public class ModelBacktestServiceImpl implements ModelBacktestService {

//    private static final String PY_PATH = "/home/dc/anaconda2/bin/python";
//    private static final String PY_FILE_PATH = "/home/dc/pyscript/Days.py";
//    //private static final String PY_FILE_PATH = "/home/dc/PycharmProjects/Test/module/Days.py";
//    private static final String BASE_PATH = "/home/dc/Data/";
    private static final String PY_PATH = "/Users/eugene/anaconda/bin/python";
    private static final String PY_FILE_PATH = "/Users/eugene/ProgramData/PyStudy/finance/module/Days.py";
    private static final String MA_PY_FILE_PATH = "/Users/eugene/ProgramData/PyStudy/finance/module/MA.py";
    private static final String BASE_PATH = "/Users/eugene/Downloads/data/";

    @Override
    public DaySvmModelBacktestResult doDaySvmModelBacktest(DaySvmModelBacktestParameters paras) {
        DaySvmModelBacktestResult res = new DaySvmModelBacktestResult();
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
            throw new RestException("模型请求参数错误", ErrorCode.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public MABacktestResult doMABacktest(MABacktestParameters paras) {
        MABacktestResult res = new MABacktestResult();
        try {
            Process p = Runtime.getRuntime().exec(PY_PATH+" "+MA_PY_FILE_PATH+" "+BASE_PATH
                    +" "+paras.getInstrument()+" "+paras.getStartDay()+" "
                    +paras.getEndDay()+" "+paras.getCash()+" "
                    +paras.getTradePercentage()+" "+paras.getFastPeriod()+" "+paras.getSlowPeriod());

            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            res.setDates(in.readLine());
            res.setClose(in.readLine());
            res.setBuys(in.readLine());
            res.setSells(in.readLine());
            res.setPortfolios(in.readLine());
            res.setTotalValue(Double.valueOf(in.readLine()));
            res.setTotalReturn(Double.valueOf(in.readLine()));
            res.setAnnualizedReturn(Double.valueOf(in.readLine()));
            p.waitFor();
            in.close();
            if(p.exitValue()!=0) return null;
            else return res;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RestException("模型请求参数错误", ErrorCode.INTERNAL_SERVER_ERROR);
        }
    }

    private static final String INSTRUMENT = "000300.SH";
    private static final long INIT_CAPITAL = 100000000;
    private static final int START_YEAR = 2014;
    private static final int YEAR_NUM = 2;
    private static final int WIN_DAYS = 15;
    private static final int WIN = 10;

    private static final String MA_INSTRUMENT = "000001.SZ";
    private static final String START_DAY = "2010-06-01";
    private static final String END_DAY = "2013-06-06";
    private static final double TRADE_PERCENTAGE = 0.003;
    private static final int FAST_PERIOD = 2;
    private static final int SLOW_PERIOD = 20;

    public static void main(String[] args){
//        daySvmTest();
        maTest();
    }

    private static void daySvmTest() {
        DaySvmModelBacktestResult res = new DaySvmModelBacktestResult();
        try {
            Process p = Runtime.getRuntime().exec(PY_PATH+" "+PY_FILE_PATH+" "+BASE_PATH
                    +" "+INSTRUMENT+" "+INIT_CAPITAL+" "
                    +START_YEAR+" "+YEAR_NUM+" "
                    +WIN_DAYS+" "+WIN);

            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while((line=in.readLine())!=null){
                System.out.println(line);
            }
//            in.readLine();
//            res.setDates(in.readLine());
//            res.setClose(in.readLine());
//            res.setBuys(in.readLine());
//            res.setSells(in.readLine());
//            res.setActionDates(in.readLine());
//            res.setPortfolios(in.readLine());
//            res.setAccuracy(Double.valueOf(in.readLine()));
//            res.setTotalValue(Double.valueOf(in.readLine()));
//            res.setTotalReturn(Double.valueOf(in.readLine()));
//            res.setAnnualizedReturn(Double.valueOf(in.readLine()));
//            System.out.println(res.getAccuracy());

            p.waitFor();
            in.close();
            System.out.println("exitValue:"+p.exitValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void maTest() {
        MABacktestResult res = new MABacktestResult();
        try {
            Process p = Runtime.getRuntime().exec(PY_PATH+" "+MA_PY_FILE_PATH+" "+BASE_PATH
                    +" "+MA_INSTRUMENT+" "+START_DAY+" "+END_DAY+" "+INIT_CAPITAL+" "
                    +TRADE_PERCENTAGE+" "+FAST_PERIOD+" "+SLOW_PERIOD);

            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while((line=in.readLine())!=null){
                System.out.println(line);
            }
//            res.setDates(in.readLine());
//            res.setClose(in.readLine());
//            res.setBuys(in.readLine());
//            res.setSells(in.readLine());
//            res.setPortfolios(in.readLine());
//            res.setTotalValue(Double.valueOf(in.readLine()));
//            res.setTotalReturn(Double.valueOf(in.readLine()));
//            res.setAnnualizedReturn(Double.valueOf(in.readLine()));

            p.waitFor();
            in.close();
            System.out.println("exitValue:"+p.exitValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
