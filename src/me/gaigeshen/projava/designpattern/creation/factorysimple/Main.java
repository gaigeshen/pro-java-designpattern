package me.gaigeshen.projava.designpattern.creation.factorysimple;

/**
 * 简单工厂模式
 * 
 * @author gaigeshen
 * @since 12/05 2018
 */
public class Main {

  public static void main(String[] args) {
    ComputerEngineer engineer = new ComputerEngineer();
    
    // 这里存在一个问题
    // 处理器和主板的类型可以随意输入
    // 而真实情况是处理器和主板是存在匹配关系的
    // 引入抽象工厂模式
    engineer.makeComputer(1, 1);
  }

}
