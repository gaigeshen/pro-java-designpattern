package me.gaigeshen.projava.designpattern.behaviour.iterator;

/**
 * 表示聚集对象
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public abstract class Aggregate {

  /**
   * 返回迭代器
   * 
   * @return 迭代器
   */
  public abstract Iterator iterator();
  
}
