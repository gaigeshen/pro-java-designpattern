package me.gaigeshen.projava.designpattern.creation.singleton;

/**
 * 双重检查锁
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class DoubleCheckSingleton {

  // 保证线程可见性
  private volatile static DoubleCheckSingleton INSTANCE = null;

  private DoubleCheckSingleton() { }

  public static DoubleCheckSingleton getInstance() {
    if (INSTANCE == null) {
      // 如果实例不存在则会进入同步块
      synchronized (DoubleCheckSingleton.class) {
        // 再次检查实例是否存在
        // 因为有可能前面的判断都为实例不存在
        if (INSTANCE == null) {
          INSTANCE = new DoubleCheckSingleton();
        }
      }
    }
    return INSTANCE;
  }
}
