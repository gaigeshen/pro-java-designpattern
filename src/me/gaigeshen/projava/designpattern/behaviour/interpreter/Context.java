package me.gaigeshen.projava.designpattern.behaviour.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文含变量和布尔值的对应
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Context {

  private Map<Variable, Boolean> map = new HashMap<>();
  
  public void assign(Variable variable, boolean value) {
    map.put(variable, value);
  }
  
  public boolean lookup(Variable variable) {
    Boolean value = map.get(variable);
    if (value == null) {
      throw new IllegalArgumentException();
    }
    return value.booleanValue();
  }
  
}
