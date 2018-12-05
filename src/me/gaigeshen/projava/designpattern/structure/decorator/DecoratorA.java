package me.gaigeshen.projava.designpattern.structure.decorator;

/**
 * 扩展的装饰着
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class DecoratorA extends Decorator {

  public DecoratorA(Component component) {
    super(component);
  }

  @Override
  public void test() {
    System.out.println("test in DecoratorA");
    super.test();
  }

}
