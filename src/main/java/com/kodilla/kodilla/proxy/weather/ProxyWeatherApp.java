package com.kodilla.kodilla.proxy.weather;

import java.util.Random;

public class ProxyWeatherApp {
    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();
        for (int n = 0; n < 5; n++) {
            WeatherReport weatherReport = new WeatherReportImpl();
            int number = new Random().nextInt(100);
            if (number < 20) {
                weatherReport.refreshData();
                System.out.println("The weather report has been refreshed");
            }
            System.out.println(weatherReport.getWeather());

            System.out.println("Execution #" + n + " just finished");
        }

        long end = System.currentTimeMillis();
        System.out.println("The execution took: " + (end - begin) + " [ms]");

        long beginWithProxy = System.currentTimeMillis();
        for (int n = 0; n < 5; n++) {
            WeatherReport weatherReportProxy = new LazyWeatherReportImpl();
            int number = new Random().nextInt(100);
            if (number < 20) {
                weatherReportProxy.refreshData();
                System.out.println("The weather report with proxy has been refreshed");
            }
            System.out.println(weatherReportProxy.getWeather());

            System.out.println("Execution with proxy #" + n + " just finished");
        }

        long endWithProxy = System.currentTimeMillis();
        System.out.println("The execution with proxy took: " + (endWithProxy - beginWithProxy) + " [ms]");
    }
}
