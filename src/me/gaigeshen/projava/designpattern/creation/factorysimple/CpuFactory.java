package me.gaigeshen.projava.designpattern.creation.factorysimple;

/**
 * 
 * @author gaigeshen
 * @since 12/05 2018
 */
public class CpuFactory {

  public static Cpu create(int type) {
    switch (type) {
    case 1: return new IntelCpu();
    case 2: return new AmdCpu();
    default: return null;
    }
  }
  
}
