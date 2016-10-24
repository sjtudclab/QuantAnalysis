package com.eugene.model;

/**
 * Created by DCLab on 2016/10/24.
 */
public class HurstModelResult {

    private String dates;
    private String close;
    private String hurst;

    public HurstModelResult() {
    }

    public HurstModelResult(String dates, String close, String hurst) {
        this.dates = dates;
        this.close = close;
        this.hurst = hurst;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getHurst() {
        return hurst;
    }

    public void setHurst(String hurst) {
        this.hurst = hurst;
    }
}
