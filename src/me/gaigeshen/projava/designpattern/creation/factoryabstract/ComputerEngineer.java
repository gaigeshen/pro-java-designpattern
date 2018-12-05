package me.gaigeshen.projava.designpattern.creation.factoryabstract;

/**
 * 
 * 装机工程师只知道处理器和主板的接口并不知道具体使用的是哪个处理器和主板
 * 
 * @author gaigeshen
 * @since 12/05 2018
 */
public class ComputerEngineer {

  private Cpu cpu;
  private Mainboard mainboard;
  
  // 使用抽象工厂
  public void makeComputer(AbstractFactory factory) {
    prepareHardware(factory);
  }

  private void prepareHardware(AbstractFactory factory) {
    cpu = factory.createCpu();
    mainboard = factory.createMainboard();
    cpu.calculate();
    mainboard.installCpu();
  }
  
}
