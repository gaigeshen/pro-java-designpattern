package me.gaigeshen.projava.designpattern.behaviour.command.example;

/**
 * 客户端角色
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Main {

  public static void main(String[] args) {
    
    // 命令接受者
    AudioPlayer player = new AudioPlayer();
    
    // 不同的命令需要命令接受者
    Command playCommand = new PlayCommand(player);
    Command rewindCommand = new RewindCommand(player);
    Command stopCommand = new StopCommand(player);
    
    // 命令执行者需要各种命令
    Keypad keypad = new Keypad();
    keypad.setPlayCommand(playCommand);
    keypad.setRewindCommand(rewindCommand);
    keypad.setStopCommand(stopCommand);
    
    // 命令执行者执行各种命令
    keypad.play();
    keypad.rewind();
    keypad.stop();
    
    // 构造宏命令
    MacroCommand macroCommand = new MacroAudioCommand();
    macroCommand.add(playCommand);
    macroCommand.add(rewindCommand);
    macroCommand.add(stopCommand);
    
    // 宏命令执行
    macroCommand.execute();
    
  }
}
