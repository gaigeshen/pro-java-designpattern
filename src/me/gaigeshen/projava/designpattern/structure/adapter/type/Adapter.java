package me.gaigeshen.projava.designpattern.structure.adapter.type;

/**
 * 适配器
 * 
 * @author gaigeshen
 * @since 12/03 2018
 */
public class Adapter extends Adaptee implements Target {

  // 拥有了被适配者现有的功能
  // 但是为了达到目标接口的功能
  // 适配器补充被适配者缺失的功能
  @Override
  public void test2() {
    System.out.println("test2 in adapter");
  }

}
