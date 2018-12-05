package me.gaigeshen.projava.designpattern.behaviour.observer.pull;

/**
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class ConcreteSubject extends Subject {

  private String state;
  
  public String getState() {
    return state;
  }
  
  public void change(String state) {
    this.state = state;
    nodifyObservers();
  }
  
}
