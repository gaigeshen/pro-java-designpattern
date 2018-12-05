package me.gaigeshen.projava.designpattern.behaviour.iterator;

/**
 * 
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class ConcreteAggregate extends Aggregate {

  private final Object[] objArray;
  
  public ConcreteAggregate(Object[] objArray) {
    this.objArray = objArray;
  }

  @Override
  public Iterator iterator() {
    return new ConcreteIterator();
  }
  
  private class ConcreteIterator implements Iterator {

    private int index;
    private int size;
    
    public ConcreteIterator() {
      index = 0;
      size = objArray.length;
    }
    
    @Override
    public void first() {
      index = 0;
    }

    @Override
    public void next() {
      if (index < size) {
        index++;
      }
    }

    @Override
    public boolean isDone() {
      return index >= size;
    }

    @Override
    public Object currentItem() {
      return objArray[index];
    }
    
  }

}
