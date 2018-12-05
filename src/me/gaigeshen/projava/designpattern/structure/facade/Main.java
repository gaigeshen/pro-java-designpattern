package me.gaigeshen.projava.designpattern.structure.facade;

/**
 * 门面模式
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class Main {

  public static void main(String[] args) {

    Computer computer = new Computer();
    computer.start();
    computer.shutdown();
    
  }

}
