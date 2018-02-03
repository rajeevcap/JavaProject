package com.capillary.design.pattern.observer.weatherMontiorApp.Impl;

import com.capillary.design.pattern.observer.weatherMontiorApp.api.Displayable;
import com.capillary.design.pattern.observer.weatherMontiorApp.api.Observer;
import com.capillary.design.pattern.observer.weatherMontiorApp.api.Subject;

/**
 * Created by rajeev on 3/2/18.
 */
public class HumidityDisplay implements Observer, Displayable {

    private Subject subject;

    private float humidity;

    public HumidityDisplay(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    public void update(Subject subject) {
        if(subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) subject;
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("current humidity : " + humidity);
    }

    public void removeMyself() {
        subject.removeObserver(this);
    }

}
