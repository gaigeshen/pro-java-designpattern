package me.gaigeshen.projava.designpattern.creation.prototype.registry;

/**
 * 登记形式的原型模式
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class Main {

  public static void main(String[] args) {
    
    Prototype prototype1 = new PrototypeImpl1();
    PrototypeManager.setPrototype("p1", prototype1);
    
    Prototype p3 = PrototypeManager.getPrototype("p1").cloning();
    p3.setName("zhangsan");
    System.out.println("First object: " + p3);
    
    Prototype p2 = new PrototypeImpl2();
    PrototypeManager.setPrototype("p1", p2);
    
    Prototype p4 = PrototypeManager.getPrototype("p1").cloning();
    p4.setName("lisi");
    System.out.println("Second object: " + p4);
    
    PrototypeManager.removePrototype("p1");
    Prototype p5 = PrototypeManager.getPrototype("p1").cloning();
    p5.setName("wangwu");
    System.out.println("Third object" + p5);
  }
}
