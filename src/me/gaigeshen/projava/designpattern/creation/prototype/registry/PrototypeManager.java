package me.gaigeshen.projava.designpattern.creation.prototype.registry;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class PrototypeManager {

  private PrototypeManager() { }

  private static final Map<String, Prototype> PROTOTYPES = new HashMap<>();

  /**
   * 
   * @param id
   * @param prototype
   */
  public static synchronized void setPrototype(String id, Prototype prototype) {
    PROTOTYPES.put(id, prototype);
  }

  /**
   * 
   * @param id
   */
  public static synchronized void removePrototype(String id) {
    PROTOTYPES.remove(id);
  }

  /**
   * 
   * @param id
   * @return
   */
  public static synchronized Prototype getPrototype(String id) {
    Prototype prototype = PROTOTYPES.get(id);
    if (prototype == null) {
      throw new RuntimeException("No such prototype of id " + id);
    }
    return prototype;
  }
}
