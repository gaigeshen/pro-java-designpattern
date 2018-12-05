package me.gaigeshen.projava.designpattern.behaviour.command;

/**
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Invoker {

  private final Command command;

  public Invoker(Command command) {
    this.command = command;
  }
  
  public void action() {
    command.execute();
  }
  
}
