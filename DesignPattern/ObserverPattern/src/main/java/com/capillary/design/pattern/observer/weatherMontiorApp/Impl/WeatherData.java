package com.capillary.design.pattern.observer.weatherMontiorApp.Impl;

import com.capillary.design.pattern.observer.weatherMontiorApp.api.Observer;
import com.capillary.design.pattern.observer.weatherMontiorApp.api.Subject;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajeev on 3/2/18.
 */
public class WeatherData implements Subject {

    List<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    private boolean measurementChanged;

    private Object LOCK = new Object();

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer observer) {
        if(observer == null) throw new IllegalArgumentException();
        synchronized (LOCK) {
            observers.add(observer);
        }
    }

    public void removeObserver(Observer observer) {
        if(observer == null) throw new IllegalArgumentException();
        synchronized (LOCK) {
            observers.remove(observer);
        }
    }

    public void notifyObservers() {
        // to prevent updating observers added after method call
        synchronized (LOCK) {
            if(measurementChanged) {
                for (Observer observer : observers) {
                    observer.update(this);
                }
            }
        }
    }

    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged() {
        measurementChanged = true;
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
