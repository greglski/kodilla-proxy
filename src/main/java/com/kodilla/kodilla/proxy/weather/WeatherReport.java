package com.kodilla.kodilla.proxy.weather;

public interface WeatherReport {
    String getWeather() throws InterruptedException;

    void refreshData() throws InterruptedException;
}
