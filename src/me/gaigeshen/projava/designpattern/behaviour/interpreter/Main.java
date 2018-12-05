package me.gaigeshen.projava.designpattern.behaviour.interpreter;

/**
 * 解释器模式
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Main {

  public static void main(String[] args) {
    
    Context context = new Context();
    Variable x = new Variable("x");
    Variable y = new Variable("y");
    
    context.assign(x, false);
    context.assign(y, true);
    
    Constant c = new Constant(true);
    
    Expression exp = new Or(new And(c, x), new And(y, new Not(x)));
    
    System.out.println("x = " + x.interpret(context));
    System.out.println("y = " + y.interpret(context));
    System.out.println(exp.toString() + " = " + exp.interpret(context));
  }
}
