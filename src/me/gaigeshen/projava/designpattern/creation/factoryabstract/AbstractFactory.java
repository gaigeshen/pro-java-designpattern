package me.gaigeshen.projava.designpattern.creation.factoryabstract;

/**
 * 
 * @author gaigeshen
 * @since 12/05 2018
 */
public interface AbstractFactory {

  Cpu createCpu();
  
  Mainboard createMainboard();
}
