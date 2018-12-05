package me.gaigeshen.projava.designpattern.behaviour.command;

/**
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class ConcreteCommand implements Command {

  private final Receiver receiver;
  
  public ConcreteCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.action();
  }

}
