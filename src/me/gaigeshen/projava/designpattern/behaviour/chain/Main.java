package me.gaigeshen.projava.designpattern.behaviour.chain;

/**
 * 责任链模式
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Main {

  public static void main(String[] args) {
   
    Handler handler1 = new ConcreteHandler();
    Handler handler2 = new ConcreteHandler();
    
    handler1.setNext(handler2);
    
    handler1.handle();
  }
}
