package me.gaigeshen.projava.designpattern.structure.proxy;

/**
 * 代理对象角色
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class ProxyObject extends AbstractObject {

  // 被代理的对象
  AbstractObject obj;
  
  public ProxyObject(AbstractObject obj) {
    this.obj = obj;
  }

  @Override
  void operation() {
    
    System.out.println("Before operation from proxy object");
    
    obj.operation();
    
    System.out.println("After operation from proxy object");
    
  }

}
