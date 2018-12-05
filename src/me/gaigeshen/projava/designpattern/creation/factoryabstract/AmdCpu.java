package me.gaigeshen.projava.designpattern.creation.factoryabstract;

/**
 * 
 * @author gaigeshen
 * @since 12/05 2018
 */
public class AmdCpu implements Cpu {

  @Override
  public void calculate() {
    System.out.println("Amd CPU");
  }

}
