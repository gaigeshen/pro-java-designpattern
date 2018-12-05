package me.gaigeshen.projava.designpattern.creation.builder.simple;

import java.util.Date;

/**
 * 
 * @author gaigeshen
 * @since 12/04 2018
 */
public class InsuranceContract {

  private String id;
  private String personName;
  private String companyName;
  private Date begin;
  private Date end;
  
  private InsuranceContract(Builder builder) {
    this.id = builder.id;
    this.personName = builder.personName;
    this.companyName = builder.companyName;
    this.begin = builder.begin;
    this.end = builder.end;
  }
  
  public String getId() {
    return id;
  }

  public String getPersonName() {
    return personName;
  }

  public String getCompanyName() {
    return companyName;
  }

  public Date getBegin() {
    return begin;
  }

  public Date getEnd() {
    return end;
  }

  @Override
  public String toString() {
    return "InsuranceContract [id=" + id + ", personName=" + personName + ", companyName=" + companyName + ", begin="
        + begin + ", end=" + end + "]";
  }

  public static class Builder {
    
    private String id;
    private String personName;
    private String companyName;
    private Date begin;
    private Date end;
    
    public Builder(String id, Date begin, Date end) {
      this.id = id;
      this.begin = begin;
      this.end = end;
    }
    
    public Builder setPersonName(String personName) {
      this.personName = personName;
      return this;
    }
    
    public Builder setCompanyName(String companyName) {
      this.companyName = companyName;
      return this;
    }
    
    // 建造方法
    // 可能会进行条件约束判断
    public InsuranceContract build() {
      if (id == null) {
        throw new IllegalStateException("Id id required");
      }
      return new InsuranceContract(this);
    }
    
  }
  
  
}
