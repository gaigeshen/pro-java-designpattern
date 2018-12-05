package me.gaigeshen.projava.designpattern.structure.adapter.object;

/**
 * 需要适配者
 * 
 * @author gaigeshen
 * @since 12/03 2018
 */
public class Adaptee {

  // 需要适配者缺失目标接口的部分功能
  // 所以就得有适配器补充相关功能
  public void test1() {
    System.out.println("test1 method in adaptee");
  }
}
