package me.gaigeshen.projava.designpattern.structure.bridge.example;

/**
 * 图片抽象类
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public abstract class AbstractImage {

  protected ImagePrinter printer;

  public void setPrinter(ImagePrinter printer) {
    this.printer = printer;
  }
  
  public abstract void parseFile(String fileName);
}
