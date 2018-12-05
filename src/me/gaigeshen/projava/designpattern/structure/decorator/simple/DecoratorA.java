package me.gaigeshen.projava.designpattern.structure.decorator.simple;

/**
 * 装饰者
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class DecoratorA extends Component {

  private Component component;
  
  public DecoratorA(Component component) {
    this.component = component;
  }

  @Override
  public void test() {
    System.out.println("test in DecoratorA");
    component.test();
  }

}
