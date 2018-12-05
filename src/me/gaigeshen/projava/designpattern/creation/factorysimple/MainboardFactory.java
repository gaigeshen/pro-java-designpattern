package me.gaigeshen.projava.designpattern.creation.factorysimple;

/**
 * 
 * @author gaigeshen
 * @since 12/05 2018
 */
public class MainboardFactory {

  public static Mainboard create(int type) {
    switch (type) {
    case 1: return new IntelMainboard();
    case 2: return new AmdMainboard();
    default: return null;
    }
  }
  
}
