package me.gaigeshen.projava.designpattern.creation.singleton;

/**
 * 延迟加载
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class HoldClassSingleton {

  private HoldClassSingleton() {}
  
  // 类级内部类只有在被调用到时才会加载
  private static class SingletonHolder {
    
    private static HoldClassSingleton INSTANCE = new HoldClassSingleton();
    
  }
  
  public static HoldClassSingleton getInstance() {
    return SingletonHolder.INSTANCE;
  }
}
