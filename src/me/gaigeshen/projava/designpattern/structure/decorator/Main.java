package me.gaigeshen.projava.designpattern.structure.decorator;

/**
 * 装饰模式，以对客户端透明的方式扩展类的功能，是继承关系的一种替代方案
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class Main {

  public static void main(String[] args) {

    // 原始对象
    Component component = new ConcreteComponent();
    
    // 装饰者装饰原始对象
    Decorator decorator = new DecoratorA(component);
    
    // 方法被增强
    decorator.test();
  }

}
