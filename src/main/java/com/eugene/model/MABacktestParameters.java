package com.eugene.model;

/**
 * Created by eugene on 16/8/26.
 */
public class MABacktestParameters {

    private String baseDir;
    private Double cash;
    private String instrument;
    private String startDay;
    private String endDay;
    private Integer fastPeriod;
    private Integer slowPeriod;
    private Double tradePercentage;

    public MABacktestParameters(){}

    public MABacktestParameters(String baseDir, Double cash, String instrument, String startDay, String endDay, Integer fastPeriod, Integer slowPeriod, Double tradePercentage) {
        this.baseDir = baseDir;
        this.cash = cash;
        this.instrument = instrument;
        this.startDay = startDay;
        this.endDay = endDay;
        this.fastPeriod = fastPeriod;
        this.slowPeriod = slowPeriod;
        this.tradePercentage = tradePercentage;
    }

    /**
     *
     * @return
     * The baseDir
     */
    public String getBaseDir() {
        return baseDir;
    }

    /**
     *
     * @param baseDir
     * The baseDir
     */
    public void setBaseDir(String baseDir) {
        this.baseDir = baseDir;
    }

    /**
     *
     * @return
     * The cash
     */
    public Double getCash() {
        return cash;
    }

    /**
     *
     * @param cash
     * The cash
     */
    public void setCash(Double cash) {
        this.cash = cash;
    }

    /**
     *
     * @return
     * The instrument
     */
    public String getInstrument() {
        return instrument;
    }

    /**
     *
     * @param instrument
     * The instrument
     */
    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    /**
     *
     * @return
     * The startDay
     */
    public String getStartDay() {
        return startDay;
    }

    /**
     *
     * @param startDay
     * The startDay
     */
    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    /**
     *
     * @return
     * The endDay
     */
    public String getEndDay() {
        return endDay;
    }

    /**
     *
     * @param endDay
     * The endDay
     */
    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    /**
     *
     * @return
     * The fastPeriod
     */
    public Integer getFastPeriod() {
        return fastPeriod;
    }

    /**
     *
     * @param fastPeriod
     * The fastPeriod
     */
    public void setFastPeriod(Integer fastPeriod) {
        this.fastPeriod = fastPeriod;
    }

    /**
     *
     * @return
     * The slowPeriod
     */
    public Integer getSlowPeriod() {
        return slowPeriod;
    }

    /**
     *
     * @param slowPeriod
     * The slowPeriod
     */
    public void setSlowPeriod(Integer slowPeriod) {
        this.slowPeriod = slowPeriod;
    }

    /**
     *
     * @return
     * The tradePercentage
     */
    public Double getTradePercentage() {
        return tradePercentage;
    }

    /**
     *
     * @param tradePercentage
     * The tradePercentage
     */
    public void setTradePercentage(Double tradePercentage) {
        this.tradePercentage = tradePercentage;
    }

}
