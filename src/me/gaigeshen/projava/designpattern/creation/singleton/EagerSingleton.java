package me.gaigeshen.projava.designpattern.creation.singleton;

/**
 * 饿汉式
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class EagerSingleton {

  private static final EagerSingleton INSTANCE = new EagerSingleton();
  
  private EagerSingleton() {}
  
  /**
   * 
   * @return
   */
  public static EagerSingleton getInstance() {
    return INSTANCE;
  }
  
}
