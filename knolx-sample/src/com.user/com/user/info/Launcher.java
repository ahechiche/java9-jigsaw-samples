package com.user.info;

import com.dept.info.Department;
import com.account.info.PersonInfo;

public class Launcher {

  public static void main(String[] args) {

    System.out.println("User Info: " + new UserInfo());
    System.out.println("Department Info: "+ new Department().info());
    System.out.println("Account Info: "+ new PersonInfo().info());

    // System.out.println("Dept Secrets : "+ new Secrets().info());
  }
}
