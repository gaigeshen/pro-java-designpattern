package me.gaigeshen.projava.designpattern.behaviour.interpreter.caculator;

/**
 * 加法
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Add extends Expression {

  private final Expression left, right;

  public Add(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int interpret(Context context) {
    return left.interpret(context) + right.interpret(context);
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
    Add other = (Add) obj;
    return left.equals(other.left) && right.equals(other.right);
  }

  @Override
  public String toString() {
    return "(" + left.toString() + " + " + right.toString() + ")";
  }
}
