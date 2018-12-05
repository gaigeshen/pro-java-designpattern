package me.gaigeshen.projava.designpattern.structure.flyweight;

/**
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class ConcreteFlyweight implements Flyweight {

  // 内部状态
  private Character intrinsicState = null;
  
  public ConcreteFlyweight(Character intrinsicState) {
    this.intrinsicState = intrinsicState;
  }

  @Override
  public void operation(String state) {
    System.out.println("Intrinsic state: " + intrinsicState);
    
    // 外部状态由客户端维持
    System.out.println("Extrinsic state: " + state);
  }

}
