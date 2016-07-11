package com.eugene.model;

public class ModelBacktestResult {

    private String dates;
    private String close;
    private String buys;
    private String sells;
    private String actionDates;
    private String portfolios;
    private Double accuracy;
    private Double totalValue;
    private Double totalReturn;
    private Double annualizedReturn;

    /**
     * No args constructor for use in serialization
     *
     */
    public ModelBacktestResult() {
    }

    /**
     *
     * @param totalReturn
     * @param dates
     * @param actionDates
     * @param portfolios
     * @param annualizedReturn
     * @param sells
     * @param accuracy
     * @param totalValue
     * @param buys
     * @param close
     */
    public ModelBacktestResult(String dates, String close, String buys, String sells, String actionDates, String portfolios, Double accuracy, Double totalValue, Double totalReturn, Double annualizedReturn) {
        this.dates = dates;
        this.close = close;
        this.buys = buys;
        this.sells = sells;
        this.actionDates = actionDates;
        this.portfolios = portfolios;
        this.accuracy = accuracy;
        this.totalValue = totalValue;
        this.totalReturn = totalReturn;
        this.annualizedReturn = annualizedReturn;
    }

    /**
     *
     * @return
     * The dates
     */
    public String getDates() {
        return dates;
    }

    /**
     *
     * @param dates
     * The dates
     */
    public void setDates(String dates) {
        this.dates = dates;
    }

    /**
     *
     * @return
     * The close
     */
    public String getClose() {
        return close;
    }

    /**
     *
     * @param close
     * The close
     */
    public void setClose(String close) {
        this.close = close;
    }

    /**
     *
     * @return
     * The buys
     */
    public String getBuys() {
        return buys;
    }

    /**
     *
     * @param buys
     * The buys
     */
    public void setBuys(String buys) {
        this.buys = buys;
    }

    /**
     *
     * @return
     * The sells
     */
    public String getSells() {
        return sells;
    }

    /**
     *
     * @param sells
     * The sells
     */
    public void setSells(String sells) {
        this.sells = sells;
    }

    /**
     *
     * @return
     * The actionDates
     */
    public String getActionDates() {
        return actionDates;
    }

    /**
     *
     * @param actionDates
     * The actionDates
     */
    public void setActionDates(String actionDates) {
        this.actionDates = actionDates;
    }

    /**
     *
     * @return
     * The portfolios
     */
    public String getPortfolios() {
        return portfolios;
    }

    /**
     *
     * @param portfolios
     * The portfolios
     */
    public void setPortfolios(String portfolios) {
        this.portfolios = portfolios;
    }

    /**
     *
     * @return
     * The accuracy
     */
    public Double getAccuracy() {
        return accuracy;
    }

    /**
     *
     * @param accuracy
     * The accuracy
     */
    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    /**
     *
     * @return
     * The totalValue
     */
    public Double getTotalValue() {
        return totalValue;
    }

    /**
     *
     * @param totalValue
     * The totalValue
     */
    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    /**
     *
     * @return
     * The totalReturn
     */
    public Double getTotalReturn() {
        return totalReturn;
    }

    /**
     *
     * @param totalReturn
     * The totalReturn
     */
    public void setTotalReturn(Double totalReturn) {
        this.totalReturn = totalReturn;
    }

    /**
     *
     * @return
     * The annualizedReturn
     */
    public Double getAnnualizedReturn() {
        return annualizedReturn;
    }

    /**
     *
     * @param annualizedReturn
     * The annualizedReturn
     */
    public void setAnnualizedReturn(Double annualizedReturn) {
        this.annualizedReturn = annualizedReturn;
    }

}