package me.gaigeshen.projava.designpattern.behaviour.observer.pull;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public abstract class Subject {

  private List<Observer> observers = new ArrayList<>();
  
  public void attach(Observer observer) {
    observers.add(observer);
  }
  
  public void detach(Observer observer) {
    observers.remove(observer);
  }
  
  public void nodifyObservers() {
    for (Observer observer : observers) {
      observer.update(this);
    }
  }
}
