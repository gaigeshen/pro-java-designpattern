package me.gaigeshen.projava.designpattern.creation.factorysimple;

/**
 * 
 * @author gaigeshen
 * @since 12/05 2018
 */
public class IntelCpu implements Cpu {

  @Override
  public void calculate() {
    System.out.println("Intel CPU");
  }

}
