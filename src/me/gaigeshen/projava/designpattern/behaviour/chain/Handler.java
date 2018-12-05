package me.gaigeshen.projava.designpattern.behaviour.chain;

/**
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public abstract class Handler {

  // 持有后继的责任对象
  private Handler handler;
  
  // 处理方法
  public abstract void handle();
  
  public Handler getNext() {
    return handler;
  }
  
  public void setNext(Handler handler) {
    this.handler = handler;
  }
  
}
