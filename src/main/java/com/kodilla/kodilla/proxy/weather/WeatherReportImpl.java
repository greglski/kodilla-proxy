package com.kodilla.kodilla.proxy.weather;

public class WeatherReportImpl implements WeatherReport {

    public WeatherReportImpl() throws InterruptedException {
        refreshData();
    }

    @Override
    public String getWeather() {
        return "Found just fresh weather report";
    }

    @Override
    public void refreshData() throws InterruptedException {
        Thread.sleep(5000);
    }
}
