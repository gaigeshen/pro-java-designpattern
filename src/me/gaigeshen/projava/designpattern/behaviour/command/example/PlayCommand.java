package me.gaigeshen.projava.designpattern.behaviour.command.example;

/**
 * 播放命令
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class PlayCommand implements Command {

  private final AudioPlayer player;
  
  public PlayCommand(AudioPlayer player) {
    this.player = player;
  }

  @Override
  public void execute() {
    player.play();
  }

}
