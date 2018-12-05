package me.gaigeshen.projava.designpattern.behaviour.interpreter;

/**
 * 标识常量
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Constant extends Expression {

  private final boolean value;
  
  public Constant(boolean value) {
    this.value = value;
  }

  @Override
  public boolean interpret(Context context) {
    return value;
  }

  @Override
  public int hashCode() {
    return toString().hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    return value == ((Constant) obj).value;
  }

  @Override
  public String toString() {
    return Boolean.toString(value);
  }

}
