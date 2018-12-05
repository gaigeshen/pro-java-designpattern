package me.gaigeshen.projava.designpattern.behaviour.templatemethod;

/**
 * 模板方法模式
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Main {

  public static void main(String[] args) {

    AbstractTemplate template = new ConcreteTemplate();
   
    // 调用模板方法
    template.templateMethod();
  }

}
