package me.gaigeshen.projava.designpattern.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元对象工厂
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class FlyweightFactory {

  private Map<Character, Flyweight> cache = new HashMap<>();
  
  public Flyweight factory(Character state) {
    
    Flyweight flyweight = cache.get(state);
    
    if (flyweight == null) {
      flyweight = new ConcreteFlyweight(state);
      cache.put(state, flyweight);
    }
    
    return flyweight;
  }
  
}
