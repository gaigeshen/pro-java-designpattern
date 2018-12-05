package me.gaigeshen.projava.designpattern.structure.facade;

/**
 * 门面
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class Computer {

  private CPU cpu;
  private Disk disk;
  
  public Computer() {
    cpu = new CPU();
    disk = new Disk();
  }
  
  public void start() {
    cpu.start();
    disk.start();
  }
  
  public void shutdown() {
    disk.shutdown();
    cpu.shutdown();
  }
}
