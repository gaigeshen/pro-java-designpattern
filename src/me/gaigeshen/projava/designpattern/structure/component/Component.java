package me.gaigeshen.projava.designpattern.structure.component;

/**
 * 抽象组件
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public abstract class Component {

  public void add(Component component) {
    // 默认不包含任何逻辑
  }
  
  public void remove(Component component) {
    // 默认不包含任何逻辑
  }
  
  public void getChild(int i) {
    // 默认不包含任何逻辑
  }
  
  public abstract void callMe();
  
}
