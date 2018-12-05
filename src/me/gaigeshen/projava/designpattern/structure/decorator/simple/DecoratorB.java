package me.gaigeshen.projava.designpattern.structure.decorator.simple;

/**
 * 装饰者
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class DecoratorB extends Component {

  private Component component;
  
  public DecoratorB(Component component) {
    this.component = component;
  }

  @Override
  public void test() {
    System.out.println("test in DecoratorB");
    component.test();
  }

}
