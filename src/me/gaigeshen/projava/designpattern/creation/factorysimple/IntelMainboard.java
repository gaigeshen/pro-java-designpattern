package me.gaigeshen.projava.designpattern.creation.factorysimple;

/**
 * 
 * @author gaigeshen
 * @since 12/05 2018
 */
public class IntelMainboard implements Mainboard {

  @Override
  public void installCpu() {
    System.out.println("Intel mainboard install CPU");
  }

}
