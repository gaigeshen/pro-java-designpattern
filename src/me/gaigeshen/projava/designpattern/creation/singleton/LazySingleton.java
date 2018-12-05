package me.gaigeshen.projava.designpattern.creation.singleton;

/**
 * 懒汉式
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class LazySingleton {
  
  private static LazySingleton INSTANCE = null;

  private LazySingleton() {}
  
  public static synchronized LazySingleton getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new LazySingleton();
    }
    return INSTANCE;
  }
}
