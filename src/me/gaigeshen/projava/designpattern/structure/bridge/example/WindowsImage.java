package me.gaigeshen.projava.designpattern.structure.bridge.example;

/**
 * 图片打印实现类
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class WindowsImage implements ImagePrinter {

  @Override
  public void paint(Matrix matrix) {
    System.out.println("Windows image painted");
  }
}
