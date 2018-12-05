package me.gaigeshen.projava.designpattern.creation.factoryabstract;

/**
 * 
 * @author gaigeshen
 * @since 12/05 2018
 */
public class AmdMainboard implements Mainboard {

  @Override
  public void installCpu() {
    System.out.println("Amd mainboard install cpu");
  }

}
