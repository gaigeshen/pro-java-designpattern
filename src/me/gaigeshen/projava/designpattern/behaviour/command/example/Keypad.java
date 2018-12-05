package me.gaigeshen.projava.designpattern.behaviour.command.example;

/**
 * 请求者角色由键盘类扮演
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Keypad {

  private Command playCommand;
  private Command rewindCommand;
  private Command stopCommand;

  public void setPlayCommand(Command playCommand) {
    this.playCommand = playCommand;
  }

  public void setRewindCommand(Command rewindCommand) {
    this.rewindCommand = rewindCommand;
  }

  public void setStopCommand(Command stopCommand) {
    this.stopCommand = stopCommand;
  }
  
  public void play() {
    playCommand.execute();
  }
  
  public void rewind() {
    rewindCommand.execute();
  }
  
  public void stop() {
    stopCommand.execute();
  }

}
