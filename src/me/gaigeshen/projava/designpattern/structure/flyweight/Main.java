package me.gaigeshen.projava.designpattern.structure.flyweight;

/**
 * 享元模式
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class Main {

  public static void main(String[] args) {
    
    FlyweightFactory factory = new FlyweightFactory();
    
    Flyweight flyweight = factory.factory(new Character('a'));
    flyweight.operation("First call: " + flyweight);
    
    flyweight = factory.factory(new Character('b'));
    flyweight.operation("Second call: " + flyweight);
    
    flyweight = factory.factory(new Character('a'));
    flyweight.operation("Third call: " + flyweight);
  }
}
