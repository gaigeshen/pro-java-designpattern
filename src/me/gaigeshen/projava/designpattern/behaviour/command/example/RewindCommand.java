package me.gaigeshen.projava.designpattern.behaviour.command.example;

/**
 * 
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class RewindCommand implements Command {

  private final AudioPlayer player;
  
  public RewindCommand(AudioPlayer player) {
    this.player = player;
  }

  @Override
  public void execute() {
    player.rewind();
  }

}
