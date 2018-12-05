package me.gaigeshen.projava.designpattern.behaviour.templatemethod;

/**
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class ConcreteTemplate extends AbstractTemplate {

  //======== 基本方法实现  ==========
  
  @Override
  protected void method1() {
    System.out.println("method1 called in ConcreteTemplate");
  }

  @Override
  protected void method2() {
    System.out.println("method2 called in ConcreteTemplate");
  }

}
