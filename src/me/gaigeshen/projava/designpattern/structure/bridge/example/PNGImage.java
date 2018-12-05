package me.gaigeshen.projava.designpattern.structure.bridge.example;

/**
 * 扩充图片抽象类
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class PNGImage extends AbstractImage {

  @Override
  public void parseFile(String fileName) {
    Matrix matrix = new Matrix();
    printer.paint(matrix);
    System.out.println(fileName + " type is: png");
  }

}
