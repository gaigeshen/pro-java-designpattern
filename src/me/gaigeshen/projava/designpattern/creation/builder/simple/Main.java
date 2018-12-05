package me.gaigeshen.projava.designpattern.creation.builder.simple;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * 简化版本的建造者模式
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class Main {
  
  // 简化版本的建造者模式
  // 将具体的建造者合并到了产品对象里面
  // 往往创建复杂的对象的时候，可能会有多种不同的选择和步骤，所以去掉导演者，把导演者的角色和客户端合并
  
  public static void main(String[] args) {
    
    LocalDateTime now = LocalDateTime.now();
    
    Date begin = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
    
    Date end = Date.from(now.plus(30, ChronoUnit.DAYS).atZone(ZoneId.systemDefault()).toInstant());
    
    InsuranceContract contract = new InsuranceContract
        .Builder("id-1", begin, end)
        .build();
    
    System.out.println(contract);
    
  }
}
