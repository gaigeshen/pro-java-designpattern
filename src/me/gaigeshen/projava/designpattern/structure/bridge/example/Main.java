package me.gaigeshen.projava.designpattern.structure.bridge.example;

/**
 * 桥接模式样例
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class Main {

  public static void main(String[] args) {

    // 两个不同的纬度单独变化
    // 操作系统和图片类型
    
    ImagePrinter printer = new WindowsImage();
    AbstractImage image = new JPGImage();
    
    image.setPrinter(printer);
    image.parseFile("avator.jpg");
    
    image.setPrinter(new LinuxImage());
    image.parseFile("avator1.jpg");
  }
}
