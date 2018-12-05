package me.gaigeshen.projava.designpattern.structure.adapter.object;

/**
 * 适配器
 * 
 * @author gaigeshen
 * @since 12/03 2018
 */
public class Adapter implements Target {

  private Adaptee adaptee;
  
  public Adapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  //// 达到了目标接口的要求
  
  @Override
  public void test1() {
    adaptee.test1(); // 委托给被适配者
  }

  // 适配器补充被适配者缺失的功能
  @Override
  public void test2() {
    System.out.println("test2 in adapter");
  }

}
