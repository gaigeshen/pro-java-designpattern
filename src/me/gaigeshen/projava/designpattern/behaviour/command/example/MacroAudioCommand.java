package me.gaigeshen.projava.designpattern.behaviour.command.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 宏命令
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class MacroAudioCommand implements MacroCommand {

  private List<Command> commands = new ArrayList<>();
  
  @Override
  public void execute() {
    for (Command cmd : commands) {
      cmd.execute();
    }
  }

  @Override
  public void add(Command command) {
    commands.add(command);
  }

  @Override
  public void remove(Command command) {
    commands.remove(command);
  }

}
