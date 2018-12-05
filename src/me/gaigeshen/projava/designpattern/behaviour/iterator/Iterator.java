package me.gaigeshen.projava.designpattern.behaviour.iterator;

/**
 * 迭代器
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public interface Iterator {

  void first();
  
  void next();
  
  boolean isDone();
  
  Object currentItem();
  
}
