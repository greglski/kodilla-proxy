package com.kodilla.kodilla.proxy.weather;

public class LazyWeatherReportImpl implements WeatherReport {

    WeatherReport weatherReport;
    @Override
    public String getWeather() throws InterruptedException {
        if (weatherReport == null) {
            weatherReport = new WeatherReportImpl();
        }
        return weatherReport.getWeather();
    }

    @Override
    public void refreshData() throws InterruptedException {
        if (weatherReport == null) {
            weatherReport = new WeatherReportImpl();
        }
        weatherReport.refreshData();
    }
}
