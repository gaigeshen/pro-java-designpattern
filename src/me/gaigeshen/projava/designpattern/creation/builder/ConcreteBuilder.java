package me.gaigeshen.projava.designpattern.creation.builder;

/**
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class ConcreteBuilder implements Builder {

  private Product product = new Product();
  
  @Override
  public void buildPart1() {
    product.setPart1("part1 from concrete builder");
  }

  @Override
  public void buildPart2() {
    product.setPart2("part2 from concrete builder");
  }

  @Override
  public Product retrieveResult() {
    return product;
  }
}
