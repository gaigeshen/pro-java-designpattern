package me.gaigeshen.projava.designpattern.behaviour.interpreter;

/**
 * 或表达式计算
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Or extends Expression {

  private final Expression left, right;
  
  public Or(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public boolean interpret(Context context) {
    return left.interpret(context) || right.interpret(context);
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
    Or other = (Or) obj;
    return left.equals(other.left) && right.equals(other.right);
  }

  @Override
  public String toString() {
    return "(" + left.toString() + " or " + right.toString() + ")";
  }

}
