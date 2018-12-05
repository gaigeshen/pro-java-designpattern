package me.gaigeshen.projava.designpattern.structure.component;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器组件
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class Composite extends Component {

  private List<Component> components = new ArrayList<>();

  private String name;
  
  public Composite(String name) {
    this.name = name;
  }
  
  @Override
  public void add(Component component) {
    components.add(component);
  }

  @Override
  public void remove(Component component) {
    components.remove(component);
  }

  @Override
  public void getChild(int i) {
    components.get(i);
  }

  @Override
  public void callMe() {
    System.out.println("You called me in composite: " + name);
    // 递归每个组件
    for (Component component : components) {
      component.callMe();
    }
  }

}
