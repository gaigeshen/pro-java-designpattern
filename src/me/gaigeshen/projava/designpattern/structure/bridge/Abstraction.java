package me.gaigeshen.projava.designpattern.structure.bridge;

/**
 * 抽象类
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public abstract class Abstraction {

  // 持有实现类接口
  protected Implementor implementor;
  
  public void setImplementor(Implementor implementor) {
    this.implementor = implementor;
  }

  // 抽象方法
  public abstract void test();
  
}
