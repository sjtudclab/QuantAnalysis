package com.eugene.model;

public class ModelBacktestParameters {

    private String baseDir;
    private String instrument;
    private Integer initCapital;
    private Integer startYear;
    private Integer yearNum;
    private Integer winDays;
    private Integer win;

    /**
     * No args constructor for use in serialization
     *
     */
    public ModelBacktestParameters() {
    }

    /**
     *
     * @param baseDir
     * @param startYear
     * @param win
     * @param instrument
     * @param winDays
     * @param initCapital
     * @param yearNum
     */
    public ModelBacktestParameters(String baseDir, String instrument, Integer initCapital, Integer startYear, Integer yearNum, Integer winDays, Integer win) {
        this.baseDir = baseDir;
        this.instrument = instrument;
        this.initCapital = initCapital;
        this.startYear = startYear;
        this.yearNum = yearNum;
        this.winDays = winDays;
        this.win = win;
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
     * The initCapital
     */
    public Integer getInitCapital() {
        return initCapital;
    }

    /**
     *
     * @param initCapital
     * The initCapital
     */
    public void setInitCapital(Integer initCapital) {
        this.initCapital = initCapital;
    }

    /**
     *
     * @return
     * The startYear
     */
    public Integer getStartYear() {
        return startYear;
    }

    /**
     *
     * @param startYear
     * The startYear
     */
    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    /**
     *
     * @return
     * The yearNum
     */
    public Integer getYearNum() {
        return yearNum;
    }

    /**
     *
     * @param yearNum
     * The yearNum
     */
    public void setYearNum(Integer yearNum) {
        this.yearNum = yearNum;
    }

    /**
     *
     * @return
     * The winDays
     */
    public Integer getWinDays() {
        return winDays;
    }

    /**
     *
     * @param winDays
     * The winDays
     */
    public void setWinDays(Integer winDays) {
        this.winDays = winDays;
    }

    /**
     *
     * @return
     * The win
     */
    public Integer getWin() {
        return win;
    }

    /**
     *
     * @param win
     * The win
     */
    public void setWin(Integer win) {
        this.win = win;
    }

}