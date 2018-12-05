package me.gaigeshen.projava.designpattern.behaviour.command;

/**
 * 命令模式
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Main {
  
  public static void main(String[] args) {
    
    // 命令接受者
    Receiver receiver = new Receiver();
    
    // 命令持有接受命令者
    Command command = new ConcreteCommand(receiver);
    
    // 命令执行者持有命令
    Invoker invoker = new Invoker(command);
    
    // 执行命令
    invoker.action();
    
  }
}
