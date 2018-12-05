package me.gaigeshen.projava.designpattern.creation.prototype;

/**
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class Client {
  
  private Prototype prototype;

  /**
   * 
   * @param prototype
   */
  public Client(Prototype prototype) {
    this.prototype = prototype;
  }

  public void operation(Prototype example) {
    prototype.clone1();
  }
  
}
