package me.gaigeshen.projava.designpattern.structure.adapter.object;

/**
 * 类的适配器模式
 * 
 * @author gaigeshen
 * @since 12/03 2018
 */
public class Main {

  public static void main(String[] args) {

    Adaptee adaptee = new Adaptee();
    
    // 适配器持有被适配者的引用
    Target target = new Adapter(adaptee);
    
    // 两个都是适配器里面的方法
    // 只不过其中存在委托给被适配者处理的方法
    target.test1();
    target.test2();
  }

}
