package me.gaigeshen.projava.designpattern.structure.proxy;

/**
 * 代理模式
 * 
 * @author gaigeshen
 * @since 02/23 2018
 */
public class Main {

  public static void main(String[] args) {
    
    // 原始对象
    AbstractObject originObj = new RealObject();
    
    // 代理对象
    AbstractObject proxy = new ProxyObject(originObj);
    
    // 调用代理对象的方法
    proxy.operation();
    
  }
  
}
