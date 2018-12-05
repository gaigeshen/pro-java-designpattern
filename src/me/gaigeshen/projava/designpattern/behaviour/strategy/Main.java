package me.gaigeshen.projava.designpattern.behaviour.strategy;

/**
 * 策略模式
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Main {

  public static void main(String[] args) {

    Context context = new Context(new StrategyA());
    context.doWhat();
    
    // 切换策略
    context = new Context(new StrategyB());
    context.doWhat();
  }

}
