package me.gaigeshen.projava.designpattern.creation.prototype.registry;

/**
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public interface Prototype {

  Prototype cloning();
  
  String getName();
  
  void setName(String name);
  
}
