package me.gaigeshen.projava.designpattern.structure.decorator;

/**
 * 具体组件
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class ConcreteComponent implements Component {

  @Override
  public void test() {
    System.out.println("test in ConcreteComponent");
  }

}
