package me.gaigeshen.projava.designpattern.creation.builder;

/**
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public interface Builder {
  
  void buildPart1();
  
  void buildPart2();
  
  Product retrieveResult();

}
