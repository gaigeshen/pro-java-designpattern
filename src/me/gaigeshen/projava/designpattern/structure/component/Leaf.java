package me.gaigeshen.projava.designpattern.structure.component;

/**
 * 叶子节点
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class Leaf extends Component {

  private String name;
  
  public Leaf(String name) {
    this.name = name;
  }

  @Override
  public void callMe() {
    System.out.println("You called me in leaf: " + name);
  }

}
