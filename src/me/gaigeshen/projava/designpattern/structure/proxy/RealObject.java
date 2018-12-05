package me.gaigeshen.projava.designpattern.structure.proxy;

/**
 * 目标对象角色，定义了代理对象所代表的目标对象
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class RealObject extends AbstractObject {

  @Override
  void operation() {
    
    System.out.println("Operation from RealObject");
    
  }

}
