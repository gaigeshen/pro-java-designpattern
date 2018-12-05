package me.gaigeshen.projava.designpattern.structure.adapter;

/**
 * 
 * 
 * @author gaigeshen
 * @since 12/03 2018
 */
public class AbstractAdapter implements Target {

  @Override
  public void test1() {
    System.out.println("test1 in AbstractTarget");
  }

  @Override
  public void test2() {
    System.out.println("test2 in AbstractTarget");
  }

}
