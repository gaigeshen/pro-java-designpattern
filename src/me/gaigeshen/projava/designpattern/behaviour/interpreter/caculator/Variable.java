package me.gaigeshen.projava.designpattern.behaviour.interpreter.caculator;

/**
 * 变量
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Variable extends Expression {

  private final String name;
  
  public Variable(String value) {
    this.name = value;
  }

  @Override
  public int interpret(Context context) {
    return context.lookup(this);
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
    return name.equals(((Variable) obj).name);
  }

  @Override
  public String toString() {
    return name;
  }

}
