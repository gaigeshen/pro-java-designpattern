package me.gaigeshen.projava.designpattern.structure.adapter;

/**
 * 缺省方法适配器模式
 * 
 * @author gaigeshen
 * @since 12/03 2018
 */
public class Main {

  public static void main(String[] args) {

    Target target = new Adaptee();
    
    target.test1(); // 方法已被重写
    target.test2(); // 方法未被重写
    
  }

}
