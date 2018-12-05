package me.gaigeshen.projava.designpattern.behaviour.iterator;

/**
 * 迭代器模式
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Main {

  
  public static void main(String[] args) {
    
    Object[] arr = { "One", "Two", "Three", "Four" };
    
    Aggregate aggregate = new ConcreteAggregate(arr);
    
    Iterator iter = aggregate.iterator();
    
    while (!iter.isDone()) {
      System.out.println(iter.currentItem());
      iter.next();
    }
    
  }
}
