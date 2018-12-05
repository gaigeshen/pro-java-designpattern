package me.gaigeshen.projava.designpattern.behaviour.strategy;

/**
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Context {

  private Strategy strategy;

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }
  
  public void doWhat() {
    strategy.doWhat();
  }
  
}
