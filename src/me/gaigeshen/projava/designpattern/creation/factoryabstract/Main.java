package me.gaigeshen.projava.designpattern.creation.factoryabstract;

/**
 * 抽象工厂模式
 * 
 * @author gaigeshen
 * @since 12/05 2018
 */
public class Main {

  public static void main(String[] args) {
    ComputerEngineer engineer = new ComputerEngineer();
    
    // 引入抽象工厂模式
    engineer.makeComputer(new IntelFactory());
  }

}
