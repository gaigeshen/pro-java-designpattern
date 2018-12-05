package me.gaigeshen.projava.designpattern.creation.prototype;

/**
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class PrototypeImpl implements Prototype {

  @Override
  public Object clone1() {
    
    Prototype prototype = new PrototypeImpl();
    
    return prototype;
  }
}
