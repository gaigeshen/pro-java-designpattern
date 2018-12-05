package me.gaigeshen.projava.designpattern.creation.factoryabstract;

/**
 * 
 * @author gaigeshen
 * @since 12/05 2018
 */
public class IntelFactory implements AbstractFactory {

  @Override
  public Cpu createCpu() {
    return new IntelCpu();
  }

  @Override
  public Mainboard createMainboard() {
    return new IntelMainboard();
  }
}
