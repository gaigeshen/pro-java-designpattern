package me.gaigeshen.projava.designpattern.behaviour.interpreter.caculator;

/**
 * 加减乘除样例
 * 
 * @author gaigeshen
 * @since 11/30 2018
 */
public class Main {

  public static void main(String[] args) {
    
    Context context = new Context();
    Variable x = new Variable("x");
    Variable y = new Variable("y");
    
    // 指定变量的值
    context.assign(x, 20);
    context.assign(y, 35);
    
    // 指定常量的值
    Constant c = new Constant(150);

    // x = 20
    // y = 35
    // ((x * y) + (y - (150 / x))) = 728
    Expression exp = new Add(new Multiply(x, y), new Subtract(y, new Divide(c, x)));
    
    System.out.println("x = " + x.interpret(context));
    System.out.println("y = " + y.interpret(context));
    System.out.println(exp.toString() + " = " + exp.interpret(context));
  }
}
