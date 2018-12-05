package me.gaigeshen.projava.designpattern.behaviour.command.example;

/**
 * 播放机接受者
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class AudioPlayer {

  public void play() {
    System.out.println("Play...");
  }
  
  public void rewind() {
    System.out.println("Rewind...");
  }
  
  public void stop() {
    System.out.println("Stop...");
  }
}
