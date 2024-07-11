package org.example.creational.singleton;

public class Configuration {
    private static Configuration instance;
    private String appName;
    private String appVersion;

    private Configuration() {
        appName = "MyApp";
        appVersion = "1.0";
    }

    public static synchronized Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
}