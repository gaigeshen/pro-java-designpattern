package me.gaigeshen.projava.designpattern.behaviour.strategy;

/**
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class StrategyA implements Strategy {

  @Override
  public void doWhat() {
    System.out.println("Do what in StrategyA");
  }

}
