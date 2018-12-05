package me.gaigeshen.projava.designpattern.structure.bridge;

/**
 * 具体实现类
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class ImplementorB implements Implementor {

  @Override
  public void test() {
    System.out.println("test in ImplementorB");
  }

}
