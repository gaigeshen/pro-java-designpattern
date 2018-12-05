package me.gaigeshen.projava.designpattern.behaviour.chain;

/**
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class ConcreteHandler extends Handler {

  @Override
  public void handle() {
    // 获取下个处理器
    Handler nextHandler = getNext();
    if (nextHandler != null) {
      // 跳过
      System.out.println("Skip from ConcreteHandler because next handler is not null");
      nextHandler.handle();
    } else {
      // 处理
      System.out.println("Handle from ConcreteHandler");
    }
  }

}
