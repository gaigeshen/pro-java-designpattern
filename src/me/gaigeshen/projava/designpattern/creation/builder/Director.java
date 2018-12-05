package me.gaigeshen.projava.designpattern.creation.builder;

/**
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class Director {

  private Builder builder;
  
  public Director(Builder builder) {
    this.builder = builder;
  }
  
  public void construct() {
    builder.buildPart1();
    builder.buildPart2();
  }
  
}
