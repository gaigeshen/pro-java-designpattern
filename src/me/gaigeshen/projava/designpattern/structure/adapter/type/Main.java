package me.gaigeshen.projava.designpattern.structure.adapter.type;

/**
 * 类的适配器模式
 * 
 * @author gaigeshen
 * @since 12/03 2018
 */
public class Main {

  public static void main(String[] args) {

    Target target = new Adapter();
    
    target.test1(); // 原本就有的功能
    target.test2(); // 适配器改造后增加的功能
  }

}
