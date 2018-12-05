package me.gaigeshen.projava.designpattern.behaviour.command.example;

/**
 * 
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class StopCommand implements Command {

  private final AudioPlayer player;
  
  public StopCommand(AudioPlayer player) {
    this.player = player;
  }

  @Override
  public void execute() {
    player.stop();
  }

}
