package me.gaigeshen.projava.designpattern.structure.proxy;

/**
 * 抽象对象角色，声明了目标对象和代理对象的共同接口，这样在任何可以使用目标对象的地方都可以使用代理对象
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public abstract class AbstractObject {

  abstract void operation();
  
}
