package me.gaigeshen.projava.designpattern.structure.component;

/**
 * 组合模式
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class Main {

  public static void main(String[] args) {

    Component test1 = new Leaf("test1");
    Component test2 = new Leaf("test2");
    Component test3 = new Leaf("test3");
    
    Composite folder1 = new Composite("folder1");
    folder1.add(test1);
    folder1.add(test2);
    folder1.add(test3);
    
    Component test4 = new Leaf("test4");
    Component test5 = new Leaf("test5");
    Component test6 = new Leaf("test6");
    
    Composite folder2 = new Composite("folder2");
    folder2.add(test4);
    folder2.add(test5);
    folder2.add(test6);
    
    Composite folderRoot = new Composite("folderRoot");
    folderRoot.add(folder1);
    folderRoot.add(folder2);
    
    folderRoot.callMe();
    
  }

}
