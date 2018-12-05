package me.gaigeshen.projava.designpattern.structure.decorator;

/**
 * 装饰者
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class Decorator implements Component {

  private Component component;
  
  public Decorator(Component component) {
    this.component = component;
  }

  @Override
  public void test() {
    System.out.println("test in Decorator");
    component.test();
  }

}
