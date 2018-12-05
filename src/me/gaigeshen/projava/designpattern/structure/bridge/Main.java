package me.gaigeshen.projava.designpattern.structure.bridge;

/**
 * 桥接模式将抽象部分与它的实现部分分离，使它们都可以独立地变化
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class Main {

  public static void main(String[] args) {

    Implementor implementorA = new ImplementorA();
    Abstraction refined = new RefinedAbstraction();
    
    refined.setImplementor(implementorA);
    refined.test();
    
    Implementor implementorB = new ImplementorB();
    refined.setImplementor(implementorB);
    
    refined.test();
    
    
    
  }

}
