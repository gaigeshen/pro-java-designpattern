package me.gaigeshen.projava.designpattern.behaviour.interpreter;

/**
 * 非表达式计算
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Not extends Expression {

  private final Expression exp;

  public Not(Expression exp) {
    this.exp = exp;
  }

  @Override
  public boolean interpret(Context context) {
    return !exp.interpret(context);
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
    Not other = (Not) obj;
    return exp.equals(other.exp);
  }

  @Override
  public String toString() {
    return "(Not " + exp.toString() + ")";
  }

}
