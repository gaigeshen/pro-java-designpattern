package me.gaigeshen.projava.designpattern.creation.factorysimple;

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
  
  public void makeComputer(int cpuType, int mainboardType) {
    prepareHardware(cpuType, mainboardType);
  }

  private void prepareHardware(int cpuType, int mainboardType) {
    // 处理器和主板使用工厂对象生成
    cpu = CpuFactory.create(cpuType);
    mainboard = MainboardFactory.create(mainboardType);
    cpu.calculate();
    mainboard.installCpu();
  }
  
}
