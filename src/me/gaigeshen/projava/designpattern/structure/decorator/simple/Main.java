package me.gaigeshen.projava.designpattern.structure.decorator.simple;

/**
 * 简化版本的装饰模式
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class Main {

  public static void main(String[] args) {

    // 原始对象
    Component component = new Component();
    
    // 被多层装饰
    DecoratorA decoratorA = new DecoratorA(component);
    DecoratorB decoratorB = new DecoratorB(decoratorA);
    
    decoratorB.test();
  }

}
