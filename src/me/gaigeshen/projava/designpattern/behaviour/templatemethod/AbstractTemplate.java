package me.gaigeshen.projava.designpattern.behaviour.templatemethod;

/**
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public abstract class AbstractTemplate {

  // 模板方法
  public void templateMethod() {
    method0();
    method1(); // 抽象方法
    method2(); // 抽象方法
  }
  
  // ======== 基本方法  ==========
  
  private void method0() {
    System.out.println("Method0 called in AbstractTemplate");
  }
  
  protected abstract void method1();
    
  protected abstract void method2();
}
