package me.gaigeshen.projava.designpattern.creation.prototype.registry;

/**
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class PrototypeImpl2 implements Prototype {

  private String name;
  
  @Override
  public Prototype cloning() {
    
    Prototype prototype = new PrototypeImpl2();
    prototype.setName(name);
    
    return prototype;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "PrototypeImpl2 [name=" + name + "]";
  }
}
