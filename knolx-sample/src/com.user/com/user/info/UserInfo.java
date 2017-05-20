package com.user.info;

public class UserInfo {
  private String name = "James";
  private String country = "Canada";

  @Override
  public String toString() {
    return "[name: "+this.name+", country: "+this.country+"]";
  }
}
