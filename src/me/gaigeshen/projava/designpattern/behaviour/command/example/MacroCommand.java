package me.gaigeshen.projava.designpattern.behaviour.command.example;

/**
 * 宏命令
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public interface MacroCommand extends Command {
  
  void add(Command command);
  
  void remove(Command command);

}
