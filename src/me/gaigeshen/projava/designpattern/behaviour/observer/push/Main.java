package me.gaigeshen.projava.designpattern.behaviour.observer.push;

/**
 * 观察者模式的推模式
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Main {

  public static void main(String[] args) {
    ConcreteSubject subject = new ConcreteSubject();
    Observer jack = new NamedObserver("Jack");
    Observer rose = new NamedObserver("Rose");
    
    // 注册观察者
    subject.attach(jack);
    subject.attach(rose);
    
    subject.change("new state");
  }

}
