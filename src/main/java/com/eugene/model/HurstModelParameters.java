package com.eugene.model;

/**
 * Created by DCLab on 2016/10/24.
 */
public class HurstModelParameters {

    private String baseDir;
    private String instrument;
    private String startDay;
    private String endDay;
    private Integer window;

    public HurstModelParameters() {
    }

    public HurstModelParameters(String baseDir, String instrument, String startDay, String endDay, Integer window) {
        this.baseDir = baseDir;
        this.instrument = instrument;
        this.startDay = startDay;
        this.endDay = endDay;
        this.window = window;
    }

    public String getBaseDir() {
        return baseDir;
    }

    public void setBaseDir(String baseDir) {
        this.baseDir = baseDir;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public Integer getWindow() {
        return window;
    }

    public void setWindow(Integer window) {
        this.window = window;
    }
}
