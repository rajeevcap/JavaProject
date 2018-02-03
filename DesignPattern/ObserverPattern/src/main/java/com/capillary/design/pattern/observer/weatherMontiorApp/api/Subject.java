package com.capillary.design.pattern.observer.weatherMontiorApp.api;

/**
 * Created by rajeev on 3/2/18.
 */
public interface Subject {

    public void addObserver(Observer var1);

    public void removeObserver(Observer var1);

    public void notifyObservers();

}
