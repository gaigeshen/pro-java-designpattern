package me.gaigeshen.projava.designpattern.behaviour.interpreter.caculator;

/**
 * 常量
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Constant extends Expression {

  private final int value;
  
  public Constant(int value) {
    this.value = value;
  }

  @Override
  public int interpret(Context context) {
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
    return Integer.toString(value);
  }

}
