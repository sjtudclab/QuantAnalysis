package com.eugene.tools;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by DCLab on 2016/10/25.
 */
public class PropertyReader {

    private static PropertyReader instance = new PropertyReader();
    private Properties p;

    private PropertyReader(){
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("path.properties");
        p = new Properties();
        try {
            p.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PropertyReader getInstance(){
        return instance;
    }

    public String getPythonPath(){
        return p.getProperty("python_path");
    }

    public String getMAPath(){
        return p.getProperty("ma_path");
    }

    public String getSVMDayPath(){
        return p.getProperty("svm_day_path");
    }

    public String getHurstPath(){
        return p.getProperty("hurst_path");
    }

    public String getDataPath(){
        return p.getProperty("data_path");
    }

}
