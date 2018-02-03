package com.capillary.design.pattern.observer.weatherMontiorApp.Impl;

import com.capillary.design.pattern.observer.weatherMontiorApp.api.Displayable;
import com.capillary.design.pattern.observer.weatherMontiorApp.api.Observer;
import com.capillary.design.pattern.observer.weatherMontiorApp.api.Subject;

/**
 * Created by rajeev on 3/2/18.
 */
public class TemperatureDisplay implements Observer, Displayable {

    private Subject subject;

    private float temperature;

    public TemperatureDisplay(Subject subject) {
        // saving subject reference for getting removed from list of Observers
        this.subject = subject;
        subject.addObserver(this);
    }

    public void update(Subject subject) {
        if(subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) subject;
            this.temperature = weatherData.getTemperature();
            display();
        }
    }

    public void display() {
        System.out.println("current temperature : " + temperature);
    }

    public void removeMyself() {
        subject.removeObserver(this);
    }

}
