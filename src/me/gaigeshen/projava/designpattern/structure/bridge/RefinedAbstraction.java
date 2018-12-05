package me.gaigeshen.projava.designpattern.structure.bridge;

/**
 * 扩充抽象类
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class RefinedAbstraction extends Abstraction {

  @Override
  public void test() {
    // 可调用实现类接口的方法
    implementor.test();
  }

}
