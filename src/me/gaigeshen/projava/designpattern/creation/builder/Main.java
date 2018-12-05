package me.gaigeshen.projava.designpattern.creation.builder;

/**
 * 建造者模式
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class Main {

  /*
   * Builder接口，这里是定义了如何构建各个部件，也就是知道每个部件功能如何实现，以及如何装配这些部件到产品中去；
   * Director是知道如何组合来构建产品，也就是说Director负责整体的构建算法，而且通常是分步骤地来执行。
   * 
   * 建造模式都存在这么两个部分，一个部分是部件构造和产品装配，另一个部分是整体构建的算法。
   */
  
  public static void main(String[] args) {
    
    // 建造者
    Builder builder = new ConcreteBuilder();
    
    // 导演者
    Director director = new Director(builder);
    
    // 导演者操作建造者
    // 可能会传入若干参数
    director.construct();
    
    // 得到建造结果
    Product product = builder.retrieveResult();
    
    System.out.println(product.getPart1());
    System.out.println(product.getPart2());
    
  }
}
