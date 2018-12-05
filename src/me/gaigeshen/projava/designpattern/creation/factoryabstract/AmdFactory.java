package me.gaigeshen.projava.designpattern.creation.factoryabstract;

/**
 * 
 * @author gaigeshen
 * @since 12/05 2018
 */
public class AmdFactory implements AbstractFactory {

  @Override
  public Cpu createCpu() {
    return new AmdCpu();
  }

  @Override
  public Mainboard createMainboard() {
    return new AmdMainboard();
  }
}
