package me.gaigeshen.projava.designpattern.behaviour.interpreter.caculator;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Context {

  private Map<Variable, Integer> map = new HashMap<>();
  
  public void assign(Variable variable, int value) {
    map.put(variable, value);
  }
  
  public int lookup(Variable variable) {
    Integer value = map.get(variable);
    if (value == null) {
      throw new IllegalArgumentException();
    }
    return value.intValue();
  }
  
}
