package me.gaigeshen.projava.designpattern.behaviour.interpreter;

/**
 * 抽象表达式
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public abstract class Expression {

  public abstract boolean interpret(Context context);
  
}
