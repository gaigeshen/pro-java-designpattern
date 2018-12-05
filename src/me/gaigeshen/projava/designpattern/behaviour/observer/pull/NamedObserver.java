package me.gaigeshen.projava.designpattern.behaviour.observer.pull;

/**
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class NamedObserver implements Observer {

  private String name;
  
  private String state;
  
  public NamedObserver(String name) {
    this.name = name;
  }

  @Override
  public void update(Subject subject) {
    this.state = ((ConcreteSubject) subject).getState();
    System.out.println("Observer " + name + "'s state changed to: '" + state + "'");
  }

  public String getState() {
    return state;
  }
  
}
